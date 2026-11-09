package uff.ic.lleme.tcc00328.aulas.threads.temporizador.model;

import java.util.Calendar;

public class Relogio extends Temporizador {

    public Relogio() {
        super();
        setNomeThread("Relogio");
        setIntervaloThread(1000);
        serviceStart();
    }

    @Override
    protected void updateTempo() {
        setTempo(Calendar.getInstance());
    }
}
