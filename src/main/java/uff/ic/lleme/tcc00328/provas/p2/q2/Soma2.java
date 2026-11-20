package uff.ic.lleme.tcc00328.provas.p2.q2;

import java.util.concurrent.RecursiveAction;

public class Soma2 extends RecursiveAction {

    private Dados tarefa = null;
    private int start;
    private int end;

    // Tune this threshold based on list size and CPU cores
    private static final int THRESHOLD = 1_000_000;

    public Soma2(Dados dados, int start, int end) {
        this.tarefa = dados;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        int length = end - start;
        // Base case: sum sequentially when below threshold
        if (length <= THRESHOLD) {
            double sum = 0.0;
            for (int i = start; i < end; i++) {
                // Use doubleValue() to unbox safely; handle nulls if your list allows them
                Double val = tarefa.get(i);
                if (val != null) {
                    sum += val;
                }
            }
            tarefa.addParcela(sum);
            return;
        }
        // Recursive case: split the index range in half
        int mid = start + (length / 2);
        Soma2 leftTask = new Soma2(tarefa, start, mid);
        Soma2 rightTask = new Soma2(tarefa, mid, end);
        leftTask.fork();
        rightTask.fork();
    }

}
