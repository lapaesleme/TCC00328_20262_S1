package uff.ic.lleme.tcc00328.provas.p2.q1.controller;

import java.util.ArrayList;
import java.util.List;
import uff.ic.lleme.tcc00328.provas.p2.q1.model.Palavra;
import uff.ic.lleme.tcc00328.provas.p2.q1.model.Sinonimos;
import uff.ic.lleme.tcc00328.provas.p2.q1.model.Substantivo;
import uff.ic.lleme.tcc00328.provas.p2.q1.model.Verbo;

public class Dicionario {

    private final List<Palavra> palavras = new ArrayList<>();
    private final List<Sinonimos> sinonimos = new ArrayList<>();

    public void addSubstantivo(String grafia, String fonetica, String significado) {
        Palavra palavra = new Palavra(grafia, fonetica);
        palavras.add(palavra);

        for (Sinonimos s : sinonimos)
            if (s.significado.equals(significado)) {
                palavra.sinonimos.add(s);
                return;
            }
        palavra.sinonimos.add(new Substantivo(significado));
    }

    public void addVerbo(String grafia, String fonetica, String significado) {
        Palavra palavra = new Palavra(grafia, fonetica);
        palavras.add(palavra);

        for (Sinonimos s : sinonimos)
            if (s.significado.equals(significado)) {
                palavra.sinonimos.add(s);
                return;
            }
        palavra.sinonimos.add(new Verbo(significado));
    }

    public List<Palavra> listPalavras() {
        return palavras;
    }
}
