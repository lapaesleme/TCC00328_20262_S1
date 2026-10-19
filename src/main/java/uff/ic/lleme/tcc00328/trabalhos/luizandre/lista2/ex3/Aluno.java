package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista2.ex3;

public class Aluno {

    public int matricula;
    public String nome;

    public Aluno(int m, String n) {
        matricula = m;
        nome = n;
    }

    public boolean equals(Aluno o) {
        return this.matricula == o.matricula && this.nome.equals(o.nome);
    }
}
