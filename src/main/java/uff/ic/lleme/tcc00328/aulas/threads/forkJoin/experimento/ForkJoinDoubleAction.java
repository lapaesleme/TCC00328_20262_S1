package uff.ic.lleme.tcc00328.aulas.threads.forkJoin.experimento;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDoubleAction {

    public static void main(String[] args) {
        // array initialization //////////////
        double[] array = new double[1_000_000];
        for (int i = 0; i < array.length; i++)
            array[i] = Math.random();
        //////////////////////////////////////

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        DoubleNumber doubleNumberTask = new DoubleNumber(array, 0, array.length);
        // Invokes compute method
        forkJoinPool.invoke(doubleNumberTask);
        System.out.println(DoubleNumber.result);
    }
}
