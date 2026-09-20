package uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex4.data;

public class Rodada {
    private int rodadaAtual;
    private int qntJogadores;
    private Lancamento[] lancamento;
    private Partida partida;
    
    
    public Rodada(int rodadaAtual, int qntJogadores, Lancamento[] lancamento, Partida partida){
        this.rodadaAtual = rodadaAtual;
        this.qntJogadores = qntJogadores;
        this.lancamento = lancamento;
        this.partida = partida;
    }

    /**
     * @return the rodadaAtual
     */
    public int getRodadaAtual() {
        return rodadaAtual;
    }

    /**
     * @param rodadaAtual the rodadaAtual to set
     */
    public void setRodadaAtual(int rodadaAtual) {
        this.rodadaAtual = rodadaAtual;
    }

    /**
     * @return the qntJogadores
     */
    public int getQntJogadores() {
        return qntJogadores;
    }

    /**
     * @param qntJogadores the qntJogadores to set
     */
    public void setQntJogadores(int qntJogadores) {
        this.qntJogadores = qntJogadores;
    }

    /**
     * @return the lancamento
     */
    public Lancamento[] getLancamento() {
        return lancamento;
    }

    /**
     * @param lancamento the lancamento to set
     */
    public void setLancamento(Lancamento[] lancamento) {
        this.lancamento = lancamento;
    }

    /**
     * @return the partida
     */
    public Partida getPartida() {
        return partida;
    }

    /**
     * @param partida the partida to set
     */
    public void setPartida(Partida partida) {
        this.partida = partida;
    }
}
