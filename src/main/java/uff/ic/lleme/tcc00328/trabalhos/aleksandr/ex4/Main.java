package uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex4;

import uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex4.data.Dado;
import uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex4.data.Jogador;
import uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex4.data.Lancamento;
import uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex4.data.Partida;
import uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex4.data.Rodada;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("--- INICIANDO TESTE DO JOGO ---");

        Jogador jogador1 = new Jogador("Aleksandr");
        Jogador[] listaJogadores = {jogador1};
        
        Partida partida = new Partida(listaJogadores, 0, 1);

        Dado dado1 = new Dado(3);
        Dado dado2 = new Dado(1);
        Dado[] dadosJogada1 = {dado1, dado2};

        Lancamento jogada1 = new Lancamento(1, dadosJogada1, jogador1, partida.getPonto());
        
        System.out.println("\n-> Lançamento 1: Jogador tirou " + dado1.getLado() + " e " + dado2.getLado());
        partida.avaliarJogada(jogada1);

        Lancamento jogada2 = null;
        if (partida.isStatus()) {
            Dado dado3 = new Dado(5);
            Dado dado4 = new Dado(2);
            Dado[] dadosJogada2 = {dado3, dado4};
            
            jogada2 = new Lancamento(2, dadosJogada2, jogador1, partida.getPonto());
            
            System.out.println("\n-> Lançamento 2: Jogador tirou " + dado3.getLado() + " e " + dado4.getLado());
            partida.avaliarJogada(jogada2);
        }

        Lancamento[] historico = {jogada1, jogada2}; 
        Rodada rodada1 = new Rodada(1, 1, historico, partida);

        System.out.println("\n--- RESUMO DA RODADA ---");
        System.out.println("Número da Rodada: " + rodada1.getRodadaAtual());
        System.out.println("Total de lançamentos registrados no histórico: " + rodada1.getLancamento().length);

        System.out.println("\n--- FIM DO TESTE ---");
        System.out.println("Partida ativa? " + partida.isStatus());
    }
} 

