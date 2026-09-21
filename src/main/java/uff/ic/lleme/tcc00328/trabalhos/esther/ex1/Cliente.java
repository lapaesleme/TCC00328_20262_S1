
package com.mycompany.projectsesther.ex1;

/**
 *
 * @author User
 */
public class Cliente {
    // vamos definir os atributos
    
    private String nome;
    private int cpf;
    private String profissao;
    private Conta conta;
    
    //Construtor, o conjunto de atributos que identificam o objeto como Cliente
    
    public  Cliente( String nome, int cpf, String profissao, Conta conta){ // public para que mag java tenha acesso e o main tb
        this.nome = nome;
        this.cpf=cpf;
        this.profissao= profissao;
        this.conta=conta;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }



    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }
    
    
    public Conta getConta() {
        return conta;
    }
    
    
}
