package uff.ic.lleme.tcc00328.trabalhos.luizandre.academico;

public abstract class AlunoImpl implements Aluno {

    private String nome;
    private String endereco;

    public AlunoImpl() {

    }

    public AlunoImpl(String nome) {
        this.nome = nome;
    }

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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public abstract Integer getId();
}
