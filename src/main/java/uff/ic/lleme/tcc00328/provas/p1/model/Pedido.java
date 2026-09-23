package uff.ic.lleme.tcc00328.provas.p1.model;

import java.util.*;

public class Pedido {

    public Integer numero = null;
    public int mesa;
    public Date inicio;
    public Date fechamento;

    /**
     * @aggregation composite
     */
    public Item[] itens = new Item[10];

    public Pedido(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        double valor = 0;
        for (Item item : itens)
            if (item != null)
                valor += item.getValor();
        return valor;
    }
}
