
package uff.ic.lleme.tcc00328.trabalhos.esther.ex3.data;



public class Inscricao {

    private Aluno aluno;
    private Turma turma;
    private double nf;
    private double vs;

    private Inscricao() { //tira o modo default
    }

    public Inscricao(Aluno aluno, Turma turma) { //recebe atributos obrigatórios
        this.aluno = aluno;
        this.turma = turma;
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the turma
     */
    public Turma getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(Turma turma) {
        this.turma = turma;
    }


    /**
     * @return the nf
     */
    public double getNf() {
        return nf;
    }

    /**
     * @param nf the nf to set
     */
    public void setNf(double nf) {
        this.nf = nf;
    }

    /**
     * @return the vs
     */
    public double getVs() {
        return vs;
    }

    /**
     * @param vs the vs to set
     */
    public void setVs(double vs) {
        this.vs = vs;
    }

}


