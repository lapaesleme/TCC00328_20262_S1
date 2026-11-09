package uff.ic.lleme.tcc00328.aulas.threads.forkJoin.experimento;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.atomic.AtomicLong;

public class DoubleNumber extends RecursiveAction {

    final int PROCESS_THRESHOLD = 1000;
    double[] array;
    int startIndex;
    int endIndex;
    static double result;
    // added variables ////////////////////////////////
    static final Object lock = new Object();
    static final AtomicLong counter = new AtomicLong();
    final long id = DoubleNumber.counter.getAndIncrement();

    //////////////////////////////////////////////////

    public DoubleNumber(double[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    protected void compute() {
        if (endIndex - startIndex <= PROCESS_THRESHOLD)
            for (int i = startIndex; i < endIndex; i++)
                synchronized (DoubleNumber.lock) {
                DoubleNumber.result += array[i] * 2;
                System.out.println("Action " + id + " has just updated result.");
            }
        else {
            int mid = (startIndex + endIndex) / 2;
            DoubleNumber leftArray = new DoubleNumber(array, startIndex, mid);
            DoubleNumber rightArray = new DoubleNumber(array, mid, endIndex);
            // Invokes the compute method recursively
            leftArray.fork();
            rightArray.fork();
            // Joins results from recursive invocations
            leftArray.join();
            rightArray.join();

            //invokeAll(leftArray, rightArray);
        }
        System.out.println("Ended action " + id);
    }

}
