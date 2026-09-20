package uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex4.data;

public class Partida {
    private Jogador[] jogador;
    private int ponto;
    private int qntJogadores;
    private int rodada;
    private boolean status; 
    
    public Partida(Jogador[] jogador, int ponto, int qntJogadores){
        this.jogador = jogador;
        this.ponto = 0;
        this.qntJogadores = qntJogadores;
        this.rodada = 1;
        this.status = true;
    }
    
    public void avaliarJogada(Lancamento jogadaAtual) {
    Dado[] dadosDaMesa = jogadaAtual.getDados();
    
    int valor1 = dadosDaMesa[0].getLado();
    int valor2 = dadosDaMesa[1].getLado();
    int soma = valor1 + valor2;
    
    if (jogadaAtual.getNumeroLancamento() == 1) {
    
        if (soma == 7 || soma == 11) {
            System.out.println("Jogador venceu!");
            this.setStatus(false);

        } else if (soma == 2 || soma == 3 || soma == 12) {
            System.out.println("Jogador perdeu!");
            this.setStatus(false);

        } else {
            this.setPonto(soma);
            System.out.println("O ponto agora é: " + this.getPonto());
        }
    }
        else {

        if (soma == this.getPonto()) {
            System.out.println("Tirou o ponto! Jogador venceu!");
            this.setStatus(false);

        } else if (soma == 7) {
            System.out.println("Tirou 7 antes do ponto! Jogador perdeu!");
            this.setStatus(false);

        } else {
            System.out.println("A soma foi " + soma + ". Jogue os dados novamente.");
        }
    }
    }

    /**
     * @return the jogador
     */
    public Jogador[] getJogador() {
        return jogador;
    }

    /**
     * @param jogador the jogador to set
     */
    public void setJogador(Jogador[] jogador) {
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
     * @return the rodada
     */
    public int getRodada() {
        return rodada;
    }

    /**
     * @param rodada the rodada to set
     */
    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
}
