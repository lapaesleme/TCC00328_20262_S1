package uff.ic.lleme.tcc00328.provas.p1.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import uff.ic.lleme.tcc00328.provas.p1.controller.App;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        App app = new App();

        // Questão 1
        app.carregarPratos("src/main/java/uff/ic/lleme/tcc00328/provas/p1/pratos.txt");
        app.carregarPedidos("src/main/java/uff/ic/lleme/tcc00328/provas/p1/pedidos.txt");

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero do pedido: ");
        System.out.println(app.buscarPedido(sc.nextInt()).getValor());

        // Questão 2
        double[] histograma = app.getHistogramaPratosPedidos();
        imprimirHistograma(histograma);

        //
        // Isso nao faz parte da prova. Servira somente para comentar sobre serializacao de objetos.
        //
        save(app, "src/main/java/uff/ic/lleme/tcc00328/provas/p1/app.bin");
        app = null;
        app = load("src/main/java/uff/ic/lleme/tcc00328/provas/p1/app.bin");
        //

    }

    public static void save(Object obj, String filename) throws FileNotFoundException, IOException {
        try (OutputStream out = new FileOutputStream(filename, false);) {
            ObjectOutputStream s = new ObjectOutputStream(out);
            s.writeObject(obj);
            s.flush();
        }
    }

    public static App load(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (InputStream in = new FileInputStream(filename);) {
            ObjectInputStream s = new ObjectInputStream(in);
            return (App) s.readObject();
        }
    }

    public static void imprimirHistograma(double[] histograma) {
        for (int i = 0; i < histograma.length; i++) {
            String prato = "   " + i;
            System.out.println(prato.substring(prato.length() - 3) + ": "
                    + new String(new char[(int) (100 * histograma[i])]).replace("\0", "X") + "|-> "
                    + histograma[i] * 100 + "%");
        }
    }

}
