package uff.ic.lleme.tcc00328.trabalhos.douglas.ex3;

import uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data.Aluno;
import uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data.Disciplina;
import uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data.Inscricao;
import uff.ic.lleme.tcc00328.trabalhos.douglas.ex3.data.Turma;

public abstract class SistemaAcademico {

    public static String nomeSistema = "Sistema Acadêmico";

    public static Turma criticarDadosTurma(String codigo, Disciplina disciplina,
            String semestre, String horario) {
        // Criticar dados
        Turma turma = new Turma("S1", disciplina, "20271", "11-13");
        // Salvar turma
        return turma;
    }

    public static Inscricao criarPedidoInscricao(Aluno aluno, Turma turma2) {
        return new Inscricao(aluno, turma2);
    }
}
