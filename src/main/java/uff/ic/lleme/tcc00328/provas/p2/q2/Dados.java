package uff.ic.lleme.tcc00328.provas.p2.q2;

import java.util.List;

public class Dados {

    private double soma;
    private List<Double> dados;

    public Dados(List<Double> dados) {
        this.dados = dados;
    }

    public synchronized void addParcela(double parcela) {
        this.soma += parcela;
    }

    public Double get(int i) {
        return dados.get(i);
    }

    public double getMedia() {
        return soma / dados.size();
    }
}
