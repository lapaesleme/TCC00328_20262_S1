package uff.ic.lleme.tcc00328.aulas.threads.temporizador.model;

import java.util.Calendar;

public class Regressivo extends Temporizador {

    public Regressivo() {
        super();
        setNomeThread("Temporizador");
        setIntervaloThread(1000);
        serviceReset();
    }

    @Override
    public final void serviceReset() {
        long dif;
        setAgora(Calendar.getInstance());
        getInicio().setTimeInMillis(getAgora().getTimeInMillis());
        getAgora().add(Calendar.MINUTE, 1);
        getTempoParcial().setTimeInMillis(
                getAgora().getTimeInMillis() - getInicio().getTimeInMillis()
                - getTempoParcial().getTimeZone().getOffset(0));
        getAgora().setTimeInMillis(getInicio().getTimeInMillis());
        dif = getTempoParcial().getTimeInMillis()
                - (getAgora().getTimeInMillis() - getInicio().getTimeInMillis());
        getTempo().setTimeInMillis(
                dif < -getTempoParcial().getTimeZone().getOffset(0) ? 0
                - getTempoParcial().getTimeZone().getOffset(0)
                : dif);
        notifyObservers();
    }

    @Override
    protected void updateTempo() {
        long dif;
        if (getClockThread() != null)
            setAgora(Calendar.getInstance());
        dif = getTempoParcial().getTimeInMillis()
                - (getAgora().getTimeInMillis() - getInicio().getTimeInMillis());
        getTempo().setTimeInMillis(
                dif < -getTempoParcial().getTimeZone().getOffset(0) ? 0
                - getTempoParcial().getTimeZone().getOffset(0)
                : dif);
    }
}
