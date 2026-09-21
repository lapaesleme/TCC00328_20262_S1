package uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data;

public class PedidoCliente {
    // Aplicando ENCAPSULAMENTO: os dados ficam protegidos e só são acessados por métodos
    private Item[] itensPedido;
    private Cliente donoDoPedido; // Associação com o cliente que fez a compra
    
    // O construtor recebe o cliente e a quantidade máxima de itens que o carrinho suporta
    public PedidoCliente(Cliente donoDoPedido, int capacidadeMaxima) {
        this.donoDoPedido = donoDoPedido;
        this.itensPedido = new Item[capacidadeMaxima]; // Inicializa o vetor vazio
    }

    public Item[] getItensPedido() {
        return itensPedido;
    }

    public Cliente getDonoDoPedido() {
        return donoDoPedido;
    }
    
    // O método recebe o Item que foi aprovado no estoque e guarda no carrinho
    public void addItem(Item itemComprado) {
        for (int i = 0; i < itensPedido.length; i++) {
            if (itensPedido[i] == null) { // Encontrou um espaço vazio no carrinho
                itensPedido[i] = itemComprado;
                System.out.println("🛒 Item adicionado ao pedido de " + donoDoPedido.getNome() + ": " + itemComprado.getProduto().getNome());
                return; // Encerra o método após adicionar
            }
        }
        System.out.println("❌ Erro: O carrinho de pedidos está cheio!");
    }
}