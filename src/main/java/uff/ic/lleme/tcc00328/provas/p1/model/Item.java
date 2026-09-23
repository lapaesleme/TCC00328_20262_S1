package uff.ic.lleme.tcc00328.provas.p1.model;

public class Item {

    public Prato prato = null;
    public int quantidade = 0;

    public Item(Prato prato, int quantidade) {
        this.prato = prato;
        this.quantidade = quantidade;
    }

    public double getValor() {
        return quantidade * prato.valor;
    }

}
