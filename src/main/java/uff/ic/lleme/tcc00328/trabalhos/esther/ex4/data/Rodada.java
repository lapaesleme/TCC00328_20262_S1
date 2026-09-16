/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.esther.ex4.data;

import uff.ic.lleme.tcc00328.trabalhos.esther.ex4.data.Jogador;

/**
 *
 * @author aluno
 */
public class Rodada {
    private int numero;
    private int qtdJogadores;
    private Jogador jogadores [];
    
    public Rodada(int numero, int qtdJogadores, Jogador jogadores []){
        this.numero=numero;
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
    
    
}
