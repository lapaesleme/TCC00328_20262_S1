/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data;

/**
 *
 * @author User
 */
public class Cliente {
    private String nome;
    
    public Cliente (String nome){
        this.nome = nome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
    // O método recebe o produto desejado, a quantidade e o Estoque para consulta
    //quando a compra for validada (dentro daquele if (itemAtual.getQuantidade() >= quantidadeDesejada)), 
    //você só precisa criar um novo Item com a quantidade que o cliente pediu e chamar esse método addItem do pedido dele.
    public void fazerPedido(Produto produtoDesejado, int quantidadeDesejada, Estoque estoque) {
        Item[] itensNoEstoque = estoque.getItens(); //entrega a "chave de acesso" ao array original que já existe lá dentro. Portanto, qualquer alteração feita através dessa variável afetará o estoque real.

        for (int i = 0; i < itensNoEstoque.length; i++) {
            Item itemAtual = itensNoEstoque[i]; //para que
            
            // Verifica se a posição não está vazia e se o nome do produto coincide
            if (itemAtual != null && itemAtual.getProduto().getNome().equals(produtoDesejado.getNome())) {
                
                // Responde à tua pergunta: Verifica se há quantidade suficiente
                if (itemAtual.getQuantidade() >= quantidadeDesejada) {
                    System.out.println("✅ Pedido validado para o cliente " + this.nome + ": " + produtoDesejado.getNome());
                    
                    // Retira a quantidade comprada do estoque
                    itemAtual.setQuantidade(itemAtual.getQuantidade() - quantidadeDesejada);
                    return; 
                } else {
                    System.out.println("❌ Erro: Não há quantidade suficiente no estoque para " + produtoDesejado.getNome());
                    return; 
                }
            }
        }
        
        // Se o laço terminar sem encontrar o produto
        System.out.println("❌ Erro: O produto não existe no estoque!");
    }
}

