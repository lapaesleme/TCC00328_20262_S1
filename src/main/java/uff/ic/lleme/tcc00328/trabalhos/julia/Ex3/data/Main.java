package uff.ic.lleme.tcc00328.trabalhos.julia.Ex3.data;

import uff.ic.lleme.tcc00328.trabalhos.julia.Ex3.data.Aluno;
import uff.ic.lleme.tcc00328.trabalhos.julia.Ex3.data.Disciplina;
import uff.ic.lleme.tcc00328.trabalhos.julia.Ex3.data.Inscricao;
import uff.ic.lleme.tcc00328.trabalhos.julia.Ex3.data.Professor;
import uff.ic.lleme.tcc00328.trabalhos.julia.Ex3.data.Turma;

public class Main {

    private static Aluno aluno;

    public static void main(String[] args) {

        // Abre janela principal da aplicação
        //
        // 1 - Oferecimento de turma
        // 1.1 - Escolher disciplina
        Disciplina poo = new Disciplina("TCC00328", "POO", "60", "");

        // 1.2 - Entrar dados da turma
        String codigoTurma = "S1";
        String semestre = "20271";
        String horario = "11-13";
        Turma s1 = SistemaAcademico.criticarDadosTurma(codigoTurma, poo, semestre, horario);
        // Fim processo criação de turma

        // 2 - Alocação de professor
        // 1.2 - Escolha da discplina
        Disciplina disciplina = poo;
        // 1.3 - Escolha da turma
        Turma turma = s1;
        // 1.4 - Alocação de professor
        // 1.4.1 - Escolha de professor
        Professor la = new Professor("123", "Luiz André", "Ciencia da Computacao", "lapaesleme@id.uff.br");
        turma.setProfessor(la);
        // Fim processo alocação Professor

        // Pedir inscrição
        // 1.1 - Login do aluno no Sistema Acadêmico
        aluno = new Aluno("123456", "Douglas", "douglas@id.uff.br");
        Aluno.nacionalidade = "brasileiro";

        //aluno = new Aluno("123", "André", "lapaesleme@id.uff.br");
        //Aluno.nacionalidade = "brasileiro";
        // 1.1 - Escolha da disciplina
        Disciplina disciplina2 = poo;
        // 1.1 - Escolha da turma
        Turma turma2 = s1;
        Inscricao inscricao = SistemaAcademico.criarPedidoInscricao(aluno, turma2);
        // Fim processo de pedido de incrição
        System.out.println(inscricao.getDataPedido());
    }
}
