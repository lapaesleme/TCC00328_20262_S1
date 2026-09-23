package uff.ic.lleme.tcc00328.provas.p1.controller;

import java.io.*;
import java.util.*;
import uff.ic.lleme.tcc00328.provas.p1.model.Item;
import uff.ic.lleme.tcc00328.provas.p1.model.Pedido;
import uff.ic.lleme.tcc00328.provas.p1.model.Prato;

public class App implements Serializable {

    public static Prato[] pratos;
    public static Pedido[] pedidos;

    public void carregarPratos(String filename) throws
            FileNotFoundException {
        pratos = new Prato[5];
        InputStream is = new FileInputStream(filename);
        Scanner sc = new Scanner(is);
        int i = 0;
        while (sc.hasNext()) {
            double valor = sc.nextDouble();
            String nome = sc.nextLine();
            Prato prato = new Prato(i, nome, valor);
            pratos[i++] = prato;
        }
    }

    public void carregarPedidos(String filename) throws
            FileNotFoundException {
        pedidos = new Pedido[100000];
        InputStream is = new FileInputStream(filename);
        Scanner sc = new Scanner(is);

        Pedido pedido = null;
        int i = 0, j = 0;
        while (sc.hasNext()) {
            int numero = sc.nextInt();
            int quantidade = sc.nextInt();
            String nomePrato = sc.nextLine();
            Prato prato = buscarPrato(nomePrato);

            if (pedido == null || pedido.numero != numero) {
                pedido = new Pedido(numero);
                pedidos[j++] = pedido;
                i = 0;
            }

            Item item = new Item(prato, quantidade);
            pedido.itens[i++] = item; //navegacao unidirecional
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

    public double[] getPopularidadeDosPratos() {
        double[] histograma = new double[pratos.length];
        double totalPedidos = 0;
        for (Pedido pedido : pedidos)
            if (pedido != null)
                for (Item item : pedido.itens)
                    if (item != null) {
                        histograma[item.prato.numero] += item.quantidade;
                        totalPedidos += item.quantidade;
                    }
        for (int i = 0; i < histograma.length; i++)
            if (totalPedidos > 0)
                histograma[i] /= totalPedidos;
        return histograma;
    }
}
