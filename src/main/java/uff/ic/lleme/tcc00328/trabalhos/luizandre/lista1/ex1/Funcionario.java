package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista1.ex1;

public abstract class Funcionario {

    private String nome;
    private String funcao;
    private double salario;
    private int tempoTrabalho;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the tempoTrabalho
     */
    public int getTempoTrabalho() {
        return tempoTrabalho;
    }

    /**
     * @param tempoTrabalho the tempoTrabalho to set
     */
    public void setTempoTrabalho(int tempoTrabalho) {
        this.tempoTrabalho = tempoTrabalho;
    }

    public abstract double calcularSalario();
}
