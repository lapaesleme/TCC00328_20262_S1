package uff.ic.lleme.tcc00328.provas.p1.controller;

import java.io.*;
import java.util.*;
import uff.ic.lleme.tcc00328.provas.p1.model.Item;
import uff.ic.lleme.tcc00328.provas.p1.model.Pedido;
import uff.ic.lleme.tcc00328.provas.p1.model.Prato;

public class App implements Serializable {

    private static Prato[] pratos;
    private static Pedido[] pedidos;

    public void carregarPratos(String filename) throws FileNotFoundException, IOException {
        pratos = new Prato[100];
        int numero = 0;

        try (InputStream is = new FileInputStream(filename)) {
            Scanner sc = new Scanner(is);
            while (sc.hasNext()) {
                double valor = sc.nextDouble();
                String nome = sc.nextLine();
                Prato prato = new Prato(numero, nome, valor);
                pratos[numero++] = prato;
            }
        }
    }

    public void carregarPedidos(String filename) throws
            FileNotFoundException, IOException {
        pedidos = new Pedido[100000];
        int qtdPedidos = 0;
        Pedido pedido = null;
        int numeroItem = 0;

        try (InputStream is = new FileInputStream(filename)) {
            Scanner sc = new Scanner(is);
            while (sc.hasNext()) {
                int numero = sc.nextInt();
                int quantidade = sc.nextInt();
                String nomePrato = sc.nextLine();
                Prato prato = buscarPrato(nomePrato);

                if (pedido == null || pedido.numero != numero) {
                    pedido = new Pedido(numero);
                    pedidos[qtdPedidos++] = pedido;
                    numeroItem = 0;
                }

                Item item = new Item(prato, quantidade);
                pedido.itens[numeroItem++] = item; //navegacao unidirecional
            }
        }
    }

    public Prato buscarPrato(String nome) {
        for (Prato prato : pratos)
            if (prato != null && prato.nome.equals(nome))
                return prato;
        return null;
    }

    public Pedido buscarPedido(int numero) {
        for (Pedido pedido : pedidos)
            if (pedido != null && pedido.numero == numero)
                return pedido;
        return null;
    }

    public double[] getHistogramaPratosPedidos() {
        int numero = 0;
        double[] histograma = new double[numero];
        double totalItensPedidos = 0;
        for (Pedido pedido : pedidos)
            if (pedido != null)
                for (Item item : pedido.itens)
                    if (item != null) {
                        histograma[item.prato.numero] += item.quantidade;
                        totalItensPedidos += item.quantidade;
                    }
        for (int i = 0; i < histograma.length; i++)
            if (totalItensPedidos > 0)
                histograma[i] /= totalItensPedidos;
        return histograma;
    }
}
