package uff.ic.lleme.tcc00328.aulas.threads.threadComExecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import uff.ic.lleme.tcc00328.aulas.threads.util.Util;

public class Main {

    public static void main(String[] args) throws Exception {
        double[] notas1 = Util.geraVetorAleatorio();
        double[] notas2 = Util.geraVetorAleatorio();
        double[] notas3 = Util.geraVetorAleatorio();
        double[] notas4 = Util.geraVetorAleatorio();
        double[] notas5 = Util.geraVetorAleatorio();
        double[] notas6 = Util.geraVetorAleatorio();

        Callable<Resultado> tarefa1 = new CallableCalculaMedia(new Dataset("disciplina 1", notas1));
        Callable<Resultado> tarefa2 = new CallableCalculaMedia(new Dataset("disciplina 2", notas2));
        Callable<Resultado> tarefa3 = new CallableCalculaMedia(new Dataset("disciplina 3", notas3));
        Callable<Resultado> thread4 = new CallableCalculaMedia(new Dataset("disciplina 4", notas4));
        Callable<Resultado> thread5 = new CallableCalculaMedia(new Dataset("disciplina 5", notas5));
        Callable<Resultado> thread6 = new CallableCalculaMedia(new Dataset("disciplina 6", notas6));

        ExecutorService executor = Executors.newFixedThreadPool(8);
        CompletionService<Resultado> completionService = new ExecutorCompletionService<>(executor);

        completionService.submit(tarefa1);
        completionService.submit(tarefa2);
        completionService.submit(tarefa3);
        completionService.submit(thread4);
        completionService.submit(thread5);
        completionService.submit(thread6);

        int received = 0;
        boolean errors = false;

        while (received < 6 && !errors) {
            Future<Resultado> resultFuture = completionService.take();
            try {
                Resultado result = resultFuture.get();
                System.out.println("disciplina: " + result.id + " media " + result.resultado);
                received++;
            } catch (Exception e) {
                errors = true;
            }
        }
        executor.shutdown();
    }
}
