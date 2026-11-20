package uff.ic.lleme.tcc00328.provas.p2.q2;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        long duracao1, duracao2;

        ArrayList<Double> numbers = new ArrayList<>(1_000_000);
        for (int i = 0; i < 200_000_000; i++) {
            numbers.add((double) (i + 1));
        }

        {
            Date inicio = new Date();
            double average = calcularMedia1(numbers);
            System.out.println("Average: " + average); // 500000.5
            Date fim = new Date();
            duracao1 = fim.getTime() - inicio.getTime();
            System.out.printf("média calculada por RecursiveTask: %d milisegundos%n", duracao1);
        }

        {
            Date inicio = new Date();
            double average = calcularMedia2(numbers);
            System.out.println("Average: " + average); // 500000.5
            Date fim = new Date();
            duracao1 = fim.getTime() - inicio.getTime();
            System.out.printf("média calculada por RecursiveAction: %d milisegundos%n", duracao1);
        }

    }

    public static double calcularMedia1(ArrayList<Double> data) {
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("ArrayList cannot be null or empty");
        }

        ForkJoinPool pool = ForkJoinPool.commonPool();
        double totalSum = pool.invoke(new Soma1(data, 0, data.size()));
        return totalSum / data.size();
    }

    public static double calcularMedia2(ArrayList<Double> numeros) throws InterruptedException {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("ArrayList cannot be null or empty");
        }

        Dados dados = new Dados(numeros);

        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new Soma2(dados, 0, numeros.size()));
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);
        return dados.getMedia();

    }
}
