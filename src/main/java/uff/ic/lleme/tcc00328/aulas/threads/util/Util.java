package uff.ic.lleme.tcc00328.aulas.threads.util;

public class Util {

    public static double[] geraVetorAleatorio() {
        int limMax = 10;
        int limMin = 0;
        int tamanho = 100_000_000;
        double[] numeros = new double[tamanho];
        limMax = 10;
        limMin = 0;
        for (int i = 0; i < numeros.length; i++)
            numeros[i] = (((limMax + 1) - limMin) * Math.random() + limMin);
        return numeros;
    }

}
