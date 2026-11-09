package uff.ic.lleme.tcc00328.aulas.threads.threadSimplesRunnable;

import uff.ic.lleme.tcc00328.aulas.threads.util.Util;

public class Main {

    public static void main(String args[]) throws InterruptedException {
        double[] notas1 = Util.geraVetorAleatorio();
        double[] notas2 = Util.geraVetorAleatorio();

        Dataset ds1 = new Dataset(notas1);
        Dataset ds2 = new Dataset(notas2);

        Thread tarefa1 = new Thread(new ThreadSimplesRunnable(ds1));
        Thread tarefa2 = new Thread(new ThreadSimplesRunnable(ds2));

        // Threads são iniciadas e processarão em paralelo
        tarefa1.start();
        tarefa2.start();

        // Thread do programa principal irá esperar cada uma das outras threads terminar
        tarefa1.join();
        tarefa2.join();

        System.out.println(ds1.resultado);
        System.out.println(ds2.resultado);

    }

}
