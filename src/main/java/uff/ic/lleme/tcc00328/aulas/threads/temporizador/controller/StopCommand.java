package uff.ic.lleme.tcc00328.aulas.threads.temporizador.controller;

import uff.ic.lleme.tcc00328.aulas.threads.temporizador.model.Temporizador;

public class StopCommand extends CommandImpl {

    public StopCommand(Temporizador t) {
        super(t);
    }

    public void execute() {
        getReceiver().serviceStop();
    }
}
