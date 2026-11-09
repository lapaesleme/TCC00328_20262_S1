package uff.ic.lleme.tcc00328.aulas.threads.threadsDisputandoObjeto;

public class ThreadCalculaMedia extends Thread {

    private Tarefa tarefa = null;

    public ThreadCalculaMedia(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void run() {
        System.out.println("Thread calculaMedia começou");
        tarefa.calculaMedia();
    }

}
