package uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data;

import java.util.Random;

public class Funcionario {
    private final String nome;
    
    public Funcionario(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    // Método que concretiza a Associação entre Funcionario, Pedido e NotaFiscal
    public void gerarNota(PedidoCliente pedido) {
        // Gera um número de compra aleatório entre 1000 e 9999
        Random gerador = new Random();
        int numeroCompra = 1000 + gerador.nextInt(9000);
        
        // Cria a nota fiscal passando o pedido, o número e o próprio funcionário (this)
        NotaFiscal nota = new NotaFiscal(pedido, numeroCompra, this);
        
        // Manda a nota fiscal gerar o arquivo de texto dela
        nota.gerarArquivoNota();
    }
}