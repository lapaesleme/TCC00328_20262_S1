package uff.ic.lleme.tcc00328.aulas.threads.forkJoin.statusAluno;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class MainForkMean {

    public static void main(String[] args) throws InterruptedException {
        long duracao1, duracao2;

        { // Processamento com thread única
            List<Aluno> alunos = inicializarListaDeAlunos();

            Date inicio = new Date();
            for (int i = 0; i < alunos.size(); i++) {
                Aluno aluno = alunos.get(i);
                aluno.situacao = (aluno.n1 + aluno.n2) / 2 >= 6 ? "aprovado" : "reprovado";
            }
            Date fim = new Date();

            duracao1 = fim.getTime() - inicio.getTime();
            System.out.printf("média calculada por thread única: %d milisegundos%n", duracao1);
        }

        { // Processamento concorrente
            List<Aluno> alunos = inicializarListaDeAlunos();

            ForkMean fb = new ForkMean(alunos);
            ForkJoinPool pool = new ForkJoinPool();

            Date inicio = new Date();
            pool.invoke(fb);
            pool.shutdown();
            pool.awaitTermination(1, TimeUnit.MINUTES);
            Date fim = new Date();

            duracao2 = fim.getTime() - inicio.getTime();
            System.out.printf("média calculada com Fork/Join: %d milisegundos%n", duracao2);
        }

        System.out.printf("diferença: %d milisegundos%n", duracao1 - duracao2);
    }

    private static List<Aluno> inicializarListaDeAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        { // inicialização da lista de alunos
            for (int i = 0; i < 65_000_000; i++) {
                Aluno aluno = new Aluno();
                aluno.n1 = Math.random() * 11; // Math.random() --> [0,1)
                aluno.n2 = Math.random() * 11;
                alunos.add(aluno);
            }
            System.out.println("lista de alunos inicializada.");
        }
        return alunos;
    }
}
