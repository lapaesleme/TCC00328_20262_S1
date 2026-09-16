
package uff.ic.lleme.tcc00328.trabalhos.esther.ex4.data;

public class Lancamento {

    private int numero;
    private Jogador jogador;
    private Dado dado;
    private int ponto;
    
    
    public Lancamento (int numero, Jogador jogador, Dado dado, int ponto){
        this.numero = numero;
        this.jogador = jogador;
        this.dado = dado;
        this.ponto = ponto;
    }
    
    public int getPonto() {
        return ponto;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the jogador
     */
    public Jogador getJogador() {
        return jogador;
    }

    /**
     * @param jogador the jogador to set
     */
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    /**
     * @return the dado
     */
    public Dado getDado() {
        return dado;
    }

    /**
     * @param dado the dado to set
     */
    public void setDado(Dado dado) {
        this.dado = dado;
    }

    /**
     * @param ponto the ponto to set
     */
    public void setPonto(int ponto) {
        this.ponto = ponto;
    }
}
