package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista2.ex7;

import uff.ic.lleme.tcc00328.trabalhos.luizandre.lista2.ex3.*;

public class Aluno implements Comparable<Aluno> {

    public Integer matricula;
    public String nome;

    public Aluno(int m, String n) {
        matricula = m;
        nome = n;
    }

    public boolean equals(Aluno obj) {
        return this.matricula == obj.matricula && this.nome.equals(obj.nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Aluno a = (Aluno) obj;
        return this.matricula == a.matricula && this.nome.equals(a.nome);
    }

    @Override
    public int compareTo(Aluno o) {
        return matricula.compareTo(o.matricula);
    }

    public String toString() {
        return matricula + ", " + nome;
    }

}
