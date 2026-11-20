package uff.ic.lleme.tcc00328.provas.vr.universidade.model;

import java.io.Serializable;

public class Participacao implements Serializable {

    public Double p1 = null;
    public Double p2 = null;
    public Aluno aluno;
    public Turma turma;

    public Participacao(Aluno aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
    }

    public String situacao() {
        Double media = media();
        if (media != null)
            if (media >= 6)
                return "Aprovado";
            else
                return "Reprovado";
        return null;
    }

    public Double media() {
        if (p1 != null && p2 != null)
            return (p1 + p2) / 2;
        return null;
    }
}
