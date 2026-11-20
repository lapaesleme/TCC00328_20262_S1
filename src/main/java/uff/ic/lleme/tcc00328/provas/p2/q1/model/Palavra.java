package uff.ic.lleme.tcc00328.provas.p2.q1.model;

import java.util.ArrayList;
import java.util.List;

public class Palavra {

    public String grafia = null;
    public String fonetica = null;
    public List<Sinonimos> sinonimos = new ArrayList<>();

    public Palavra() {
        super();
    }

    public Palavra(String grafia, String fonetica) {
        this.grafia = grafia;
        this.fonetica = fonetica;
    }
}
