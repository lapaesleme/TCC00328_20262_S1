package uff.ic.lleme.tcc00328.provas.p2.q1.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Sinonimos {

    public List<Palavra> palavras = new ArrayList<>();
    public String significado = null;

    public Sinonimos() {
        super();
    }

    public Sinonimos(String significado) {
        this.significado = significado;
    }
}
