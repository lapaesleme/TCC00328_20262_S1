package uff.ic.lleme.tcc00328.provas.vr.universidade.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Turma implements Serializable {

    public String codigo = null;

    public final Map<String, Participacao> participacoes = new HashMap<>();

    public Turma(String codigo) {
        this.codigo = codigo;
    }

    public void inscreverAluno(Participacao participacao) {
        if (participacao.turma == this
                && !participacoes.containsKey(participacao.aluno.matricula))
            this.participacoes.put(participacao.aluno.matricula, participacao);
        else
            System.out.println("Aluno já cadastrado ou é participação em outra turma.");
    }

    public List<Aluno> listAlunos() {
        ArrayList<Aluno> alunos = new ArrayList<>();
        for (Participacao p : participacoes.values())
            alunos.add(p.aluno);
        return alunos;
    }

    public void incluirNotas(double p1, double p2, Aluno a) {
        if (participacoes.containsKey(a.matricula)) {
            participacoes.get(a.matricula).p1 = p1;
            participacoes.get(a.matricula).p2 = p2;
        } else
            System.out.println("Aluno nao esta inscrito na turma.");
    }
}
