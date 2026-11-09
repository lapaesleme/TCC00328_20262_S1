package uff.ic.lleme.tcc00328.aulas.threads.temporizador.model;

import java.util.ArrayList;
import uff.ic.lleme.tcc00328.aulas.threads.temporizador.view.Observer;

public abstract class SubjectImpl implements Subject {

    private ArrayList<Observer> registry = new ArrayList();
    private Object state;

    @Override
    public void attach(Observer o) {
        registry.add(o);
        // notifyObservers();
    }

    @Override
    public void deattach(Observer o) {
        registry.remove(o);
        // notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer o : registry)
            o.update();
    }

    /**
     *
     * @throws Throwable
     */
    @Override
    public void finalize() throws Throwable {
        //super.finalize();
        registry = null;
        System.gc();
        System.out.println("Coletando lixo .....");
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }
}
