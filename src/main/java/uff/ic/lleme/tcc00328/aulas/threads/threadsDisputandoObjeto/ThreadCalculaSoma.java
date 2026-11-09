package uff.ic.lleme.tcc00328.aulas.threads.threadsDisputandoObjeto;

public class ThreadCalculaSoma extends Thread {

    private Tarefa tarefa = null;

    public ThreadCalculaSoma(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void run() {
        System.out.println("Thread calculaSoma começou");
        tarefa.calculaSoma();
    }
}
