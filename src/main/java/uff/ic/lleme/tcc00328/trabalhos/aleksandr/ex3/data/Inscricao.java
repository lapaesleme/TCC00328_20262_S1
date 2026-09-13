package uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex3.data;

import java.util.Calendar;

public class Inscricao {
    
    private Aluno aluno;
    private Turma turma;
    private String dataPedido;
    private String dataAprovacao;
    
           
    private Inscricao(){
    }
    
    public Inscricao(Aluno aluno, Turma turma){
        this.aluno = aluno;
        this.turma = turma;
        this.dataPedido = Calendar.getInstance().toString();
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
     * @return the dataPedido
     */
    public String getDataPedido() {
        return dataPedido;
    }

    /**
     * @param dataPedido the dataPedido to set
     */
    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    /**
     * @return the dataAprovacao
     */
    public String getDataAprovacao() {
        return dataAprovacao;
    }

    /**
     * @param dataAprovacao the dataAprovacao to set
     */
    public void setDataAprovacao(String dataAprovacao) {
        this.dataAprovacao = dataAprovacao;
    }
}
