package uff.ic.lleme.tcc00328.provas.p2.q2;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class Soma1 extends RecursiveTask<Double> {

    private final List<Double> list;
    private final int start;
    private final int end;

    // Tune this threshold based on list size and CPU cores
    private static final int THRESHOLD = 1_000_000;

    public Soma1(List<Double> list, int start, int end) {
        this.list = list;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        int length = end - start;
        // Base case: sum sequentially when below threshold
        if (length <= THRESHOLD) {
            double sum = 0.0;
            for (int i = start; i < end; i++) {
                // Use doubleValue() to unbox safely; handle nulls if your list allows them
                Double val = list.get(i);
                if (val != null) {
                    sum += val;
                }
            }
            return sum;
        }
        // Recursive case: split the index range in half
        int mid = start + (length / 2);
        Soma1 leftTask = new Soma1(list, start, mid);
        Soma1 rightTask = new Soma1(list, mid, end);
        leftTask.fork();
        double rightResult = rightTask.compute();
        double leftResult = leftTask.join();
        return leftResult + rightResult;
    }

}
