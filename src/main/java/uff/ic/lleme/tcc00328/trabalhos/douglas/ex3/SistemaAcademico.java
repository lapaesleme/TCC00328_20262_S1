package uff.ic.lleme.tcc00328.trabalhos.douglas.ex3;

import uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data.Disciplina;
import uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data.Turma;

public abstract class SistemaAcademico {

    public static Turma oferecerTurma(String codigo, Disciplina disciplina,
            String semestre, String horario) {
        // Criticar dados
        Turma turma = new Turma("S1", disciplina, "20271", "11-13");
        // Salvar turma
        return turma;
    }
}
