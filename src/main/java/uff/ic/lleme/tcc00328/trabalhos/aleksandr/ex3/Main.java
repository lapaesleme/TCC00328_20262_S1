package uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex3;

import uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex3.data.Aluno;
import uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex3.data.Disciplina;
import uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex3.data.Inscricao;
import uff.ic.lleme.tcc00328.trabalhos.aleksandr.ex3.data.Turma;

public class Main {
    
    public static void main(String[] args) {
        Disciplina poo = new Disciplina("TCC00328", "60", "POO", "");
        
        String codigo = "S1";
        String semestre = "2026-1";
        String horario = "11-13";
        
        Turma s1 = SistemaAcademico.criticarDadosTurma(codigo, poo, semestre, horario);
        Aluno aluno = new Aluno("Aleksandr", "123456", "aleksandrvolkov@id.uff.br");
        
        Inscricao inscricao = SistemaAcademico.criarPedidoInscricao(aluno, s1);
        
        System.out.println("Inscrição realizada para o aluno: " + inscricao.getAluno().getNome());
    }
}