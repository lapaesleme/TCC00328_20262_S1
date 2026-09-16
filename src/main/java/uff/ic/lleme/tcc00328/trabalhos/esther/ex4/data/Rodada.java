/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.esther.ex4.data;

/**
 *
 * @author aluno
 */
public class Rodada {

    private int numero;
    private int qtdJogadores;
    //private Jogador jogadores[];
    private Lancamento[] lancamentos;
    private Partida partida;

    public Rodada(int numero, int qtdJogadores, Jogador jogadores[]) {
        this.numero = numero;
        this.qtdJogadores = qtdJogadores;
        this.jogadores = jogadores;
    }

    public int getNumero() {
        return numero;
    }

    public int getQtdJogadores() {
        return qtdJogadores;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

}
