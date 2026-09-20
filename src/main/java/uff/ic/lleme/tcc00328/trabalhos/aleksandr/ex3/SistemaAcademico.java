package uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex3;

import uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex3.data.Aluno;
import uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex3.data.Disciplina;
import uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex3.data.Inscricao;
import uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex3.data.Turma;

public class SistemaAcademico {
    
    public static String nomeSistema = "Sistema Acadêmico";

    public static Turma criticarDadosTurma(String codigo, Disciplina disciplina, String semestre, String horario) {
        return new Turma(codigo, disciplina, semestre, horario);
    }

    public static Inscricao criarPedidoInscricao(Aluno aluno, Turma turma2) {
        return new Inscricao(aluno, turma2);
    }
}


