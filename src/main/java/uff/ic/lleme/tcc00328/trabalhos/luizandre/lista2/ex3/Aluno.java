package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista2.ex3;

public class Aluno {

    public int matricula;
    public String nome;

    public Aluno(int m, String n) {
        matricula = m;
        nome = n;
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

}
