package uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado;

import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data.Cliente;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data.Funcionario;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data.Item;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data.Mercado;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data.PedidoCliente;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data.Produto;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("=== 1. INICIALIZANDO O SISTEMA DO MERCADO ===");
        // Cria o mercado com capacidade para 5 funcionários e 100 itens diferentes no estoque
        Mercado mercado = new Mercado("Supermercado UFF", "Rua Principal, 123", 5, 100);
        
        // Contratação de funcionário
        Funcionario f1 = new Funcionario("João Caixa");
        mercado.contratarFuncionario(f1);

        
        System.out.println("\n=== 2. ABASTECENDO O ESTOQUE ===");
        // Instanciação de Produtos (Conceitos gerais de objetos)[cite: 3]
        Produto p1 = new Produto("Arroz 5kg", 25.90);
        Produto p2 = new Produto("Feijão Preto 1kg", 8.50);
        Produto p3 = new Produto("Macarrão", 4.30);
        Produto p4 = new Produto("Óleo de Soja", 6.20);
        
        // Adicionando os itens ao estoque do mercado (mantendo baixo acoplamento)[cite: 4]
        mercado.getEstoque().adicionarItem(new Item(p1, 50));  // 50 pacotes de arroz
        mercado.getEstoque().adicionarItem(new Item(p2, 30));  // 30 pacotes de feijão
        mercado.getEstoque().adicionarItem(new Item(p3, 100)); // 100 pacotes de macarrão
        mercado.getEstoque().adicionarItem(new Item(p4, 40));  // 40 garrafas de óleo


        System.out.println("\n=== 3. CLIENTE INICIA A COMPRA ===");
        Cliente cliente = new Cliente("Esther");
        
        // Cria um carrinho de compras para o cliente que suporta até 10 itens
        PedidoCliente carrinho = new PedidoCliente(cliente, 10);
        
        // Cliente tenta comprar 2 pacotes de arroz
        System.out.println("\nSolicitando: 2x " + p1.getNome());
        cliente.fazerPedido(p1, 2, mercado.getEstoque());
        carrinho.addItem(new Item(p1, 2)); // Adiciona no carrinho após validação

        // Cliente tenta comprar 3 pacotes de feijão
        System.out.println("\nSolicitando: 3x " + p2.getNome());
        cliente.fazerPedido(p2, 3, mercado.getEstoque());
        carrinho.addItem(new Item(p2, 3));
        
        // Cliente tenta comprar 50 garrafas de óleo (Vai dar erro pois só tem 40)
        System.out.println("\nSolicitando: 50x " + p4.getNome());
        cliente.fazerPedido(p4, 50, mercado.getEstoque());
        // Como o pedido acima vai falhar na validação do estoque, não adicionamos ao carrinho


        System.out.println("\n=== 4. PASSANDO NO CAIXA (GERAÇÃO DE ARQUIVO) ===");
        // O funcionário recebe o carrinho do cliente e emite a nota fiscal, 
        // o que automaticamente dispara a escrita do arquivo .txt com tratamento de exceções[cite: 3]
        f1.gerarNota(carrinho);
        
        System.out.println("\nSistema finalizado. Verifique a pasta raiz do projeto para ver o arquivo .txt gerado!");
    }
}