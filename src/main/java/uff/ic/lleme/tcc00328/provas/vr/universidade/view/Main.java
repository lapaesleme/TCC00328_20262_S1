package uff.ic.lleme.tcc00328.provas.vr.universidade.view;

import uff.ic.lleme.tcc00328.provas.vr.universidade.controler.Sistema;
import uff.ic.lleme.tcc00328.provas.vr.universidade.model.Aluno;
import uff.ic.lleme.tcc00328.provas.vr.universidade.model.Disciplina;
import uff.ic.lleme.tcc00328.provas.vr.universidade.model.Turma;

public class Main {

    public static void main(String[] args) {
        //Sistema.carregar("universidade.dat");
        Aluno a1 = Sistema.cadastrarAluno("123", "Luiz");
        Aluno a2 = Sistema.cadastrarAluno("456", "Andre");
        Disciplina d1 = Sistema.criarDisciplina("D1", "POO");
        Disciplina d2 = Sistema.criarDisciplina("D2", "Prog I");
        Turma t1 = Sistema.criarTurma("A1.2015.2", d1);
        Sistema.inscreverAluno(a1, t1);
        Sistema.inscreverAluno(a2, t1);
        Sistema.capturarNotas("A1.2015.2", d1);
        Sistema.listarSituacao();
        Sistema.gravar("universidade.dat");
    }
}
