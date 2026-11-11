package uff.ic.lleme.tcc00328.aulas.threads.forkJoin.statusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class ForkMean extends RecursiveAction {

    private int inicio = 0;
    private int fim = 0;
    private List<Aluno> alunos = new ArrayList<>();
    protected static int tamanhoJob = 1_000_000;

    public ForkMean(List<Aluno> alunos) {
        this.alunos = alunos;
        this.inicio = 0;
        this.fim = alunos.size();
    }

    private ForkMean(List<Aluno> alunos, int inicio, int fim) {
        this.alunos = alunos;
        this.inicio = inicio;
        this.fim = fim;
    }

    protected void computeDirectly() {
        for (int i = inicio; i < fim; i++) {
            Aluno aluno = alunos.get(i);
            aluno.situacao = (aluno.n1 + aluno.n2) / 2 >= 6 ? "aprovado" : "reprovado";
        }
    }

    @Override
    protected void compute() {

        if (fim - inicio < tamanhoJob) {
            System.out.println(this + ": calculando.");
            computeDirectly();
        } else {
            int meio = (inicio + fim) / 2;
            System.out.println(this + ": muito grande, dividindo e encerrando.");
            (new ForkMean(alunos, inicio, meio)).fork();
            (new ForkMean(alunos, meio, fim)).fork();
        }
    }

    @Override
    public String toString() {
        return "Compute " + inicio + "-" + fim + ":";
    }
}
