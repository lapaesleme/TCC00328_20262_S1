package uff.ic.lleme.tcc00328.aulas.threads.threadComExecutor;

import java.util.concurrent.Callable;

public class CallableCalculaMedia implements Callable<Resultado> {

    private Dataset tarefa;

    public CallableCalculaMedia(Dataset tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public Resultado call() {
        double resultado = 0.0;
        for (Double numero : tarefa.notas)
            resultado += numero;
        resultado /= tarefa.notas.length;
        return new Resultado(tarefa.id, resultado);
    }

}
