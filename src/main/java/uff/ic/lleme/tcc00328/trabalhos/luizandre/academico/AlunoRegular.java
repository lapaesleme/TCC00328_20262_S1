package uff.ic.lleme.tcc00328.trabalhos.luizandre.academico;

public class AlunoRegular extends AlunoImpl {

    private Integer matricula;

    private AlunoRegular() {

    }

    public AlunoRegular(int matricula, String nome) {
        super(nome);
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    /**
     * @return the matricula
     */
    public Integer getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return getMatricula() + ", " + getNome();
    }

    public Integer getId() {
        return matricula;
    }
}
