package uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data;

public class Mercado {
    private final String nome;
    private final String endereco;
    // Vetor de funcionários
    private Funcionario[] funcionarios;
    // ASSOCIAÇÃO: O mercado agora "tem um" estoque
    private Estoque estoque; 
    
    // O construtor agora recebe a capacidade máxima de funcionários e de itens no estoque
    public Mercado (String nome, String endereco, int maxFuncionarios, int maxEstoque){
        this.nome = nome;
        this.endereco = endereco;
        
        // Inicializa o vetor de funcionários vazio com o tamanho máximo
        this.funcionarios = new Funcionario[maxFuncionarios];
        
        // Inicializa o estoque do mercado com o tamanho máximo
        this.estoque = new Estoque(maxEstoque);
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
    
    // Método para acessar o estoque do mercado
    public Estoque getEstoque() {
        return estoque;
    }
    
    // CORREÇÃO: O método agora recebe o objeto Funcionario que será contratado
    public void contratarFuncionario(Funcionario novoFuncionario){
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = novoFuncionario;
                System.out.println("Funcionário contratado na vaga: " + i);
                return; // O return encerra o método assim que adicionado
            }
        }
        System.out.println("Erro: mercado atingiu capacidade máxima de funcionários!");
    }
}