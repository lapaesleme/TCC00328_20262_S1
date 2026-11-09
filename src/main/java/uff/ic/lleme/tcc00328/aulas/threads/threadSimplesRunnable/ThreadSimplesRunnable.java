package uff.ic.lleme.tcc00328.aulas.threads.threadSimplesRunnable;

public class ThreadSimplesRunnable implements Runnable {

    private Dataset tarefa = null;

    public ThreadSimplesRunnable(Dataset tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void run() {
        tarefa.resultado = 0.0;
        for (Double numero : tarefa.numeros)
            tarefa.resultado += numero;
        tarefa.resultado /= tarefa.numeros.length;
    }
}
