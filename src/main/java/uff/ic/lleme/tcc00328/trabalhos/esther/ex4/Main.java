/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.esther.ex4;

import uff.ic.lleme.tcc00328.trabalhos.esther.ex4.data.Dado;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex4.data.Jogador;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex4.data.Lancamento;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex4.data.Partida;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex4.data.Rodada;

         
public class Main {
    
    public static void main (String args[]){
        
        
        // 1 - Começar a partida
        Partida partida1 = new Partida(1); 
        System.out.println("Bem vindos à partida " + partida1.getNumero());
        
        // 2 - Criar os jogadores que farão parte dessa partida
        // não posso instancía-los dentro de array diretamente por serem objetos.
        Jogador j1 = new Jogador("Maria");
        Jogador j2 = new Jogador("João");
        Jogador j3 = new Jogador("Clara");
        
        // Junta todos no array
        Jogador[] jogadores = {j1, j2, j3};
        
        // 3 - Iniciar a Rodada
        // A rodada acaba quando todos jogadores fazem seus lançamentos
        Rodada rodada1 = new Rodada(1, jogadores.length, jogadores);
        
        // 4 - Instanciar os dados do jogo
        Dado dado1 = new Dado(1);
        Dado dado2 = new Dado(2);
        
        // 5 - Processar lançamentos

        
   
    }
}
  

