/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.esther.ex4.data;

/**
 *
 * @author aluno
 */
public class Partida {

    private int numero;
    private Jogador[] jogadores;
    private int qtdJogadores;
    private Rodada[] rodadas;
    private int n;

    public Partida(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void addRodada(Rodada rodada) {
        rodadas[n++] = rodada;
        rodada.setPartida(this);
    }

}
