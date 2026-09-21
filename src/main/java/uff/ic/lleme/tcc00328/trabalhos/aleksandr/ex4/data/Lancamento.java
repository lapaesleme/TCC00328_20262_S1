package uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex4.data;

public class Lancamento {
    private int numeroLancamento;
    private Dado[] dados;
    private Jogador jogador;
    private int ponto;
    
    public Lancamento(int numeroLancamento, Dado[] dados, Jogador jogador, int ponto){
        this.numeroLancamento = numeroLancamento;
        this.dados = dados;
        this.jogador = jogador;
        this.ponto = ponto;
    }
    
    /**
     * @return the numeroLancamento
     */
    public int getNumeroLancamento() {
        return numeroLancamento;
    }

    /**
     * @param numeroLancamento the numeroLancamento to set
     */
    public void setNumeroLancamento(int numeroLancamento) {
        this.numeroLancamento = numeroLancamento;
    }

    /**
     * @return the dados
     */
    public Dado[] getDados() {
        return dados;
    }

    /**
     * @param dados the dados to set
     */
    public void setDados(Dado[] dados) {
        this.dados = dados;
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
     * @return the ponto
     */
    public int getPonto() {
        return ponto;
    }

    /**
     * @param ponto the ponto to set
     */
    public void setPonto(int ponto) {
        this.ponto = ponto;
    }
}
