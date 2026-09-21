package uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data.Cliente;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data.Estoque;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data.Funcionario;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data.Item;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data.Mercado;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data.NotaFiscal;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data.PedidoCliente;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data.Produto;
import uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.Main;        


public  abstract class ControleEstoque {
    
       // Demonstra os CONCEITOS DE ASSOCIAÇÕES ENTRE CLASSES, conectando a ação ao estoque específico[cite: 3].
    public void registrarEntrada(Estoque estoque, Item item) {
        
        System.out.println("Iniciando controle de entrada de mercadoria...");
        
        // Mantém baixo ACOPLAMENTO: o controle apenas manda o estoque executar a ação[cite: 3].
        estoque.adicionarItem(item);
   }
}
