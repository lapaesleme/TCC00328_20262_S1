/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data;

/**
 *
 * @author User
 */
public class Estoque {
    private Item [] itensEstoque;
    
    // O construtor agora recebe o tamanho que o vetor deve ter.
    public Estoque(int capacidadeMaxima) {
        this.itensEstoque = new Item[capacidadeMaxima];
   
    }

    /**
     * @return the itens
     */
    public Item[] getItens() {
        return itensEstoque;
    }
    
    
    // O próprio Estoque tem o comportamento de adicionar o item no primeiro espaço vazio.
    public void adicionarItem(Item novoItem) {
        for (int i = 0; i < itensEstoque.length; i++) {
            if (itensEstoque[i] == null) {
                itensEstoque[i] = novoItem;
                System.out.println("Item inserido com sucesso na posição " + i);
                return; // O return encerra o método assim que o item for adicionado
            }
        }
        System.out.println("Erro: Não há mais espaço no estoque!");
    }
    
}
