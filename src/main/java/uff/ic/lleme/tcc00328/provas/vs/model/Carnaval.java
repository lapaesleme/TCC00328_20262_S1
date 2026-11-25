package uff.ic.lleme.tcc00328.provas.vs;

import java.util.HashSet;
import java.util.Set;

public class Carnaval {

    public int ano = 0;
    public final Set<Escola> escolas = new HashSet<>();
    public final Set<Jurado> jurados = new HashSet<>();
    public final Set<Desfile> desfiles = new HashSet<>();

    public void registrarJurado(Jurado jurado) throws Exception {
        verificarDuplicidadeJurado(jurado);
        verificarLimiteJurados(jurado);
        jurados.add(jurado);
    }

    public void registrarEscola(Escola escola) throws Exception {
        verificarDuplicidadeEscola(escola);
        escolas.add(escola);
    }

    public void registrarDesfile(Desfile desfile) throws Exception {
        verificarDuplicidadeDesfile(desfile);
        desfiles.add(desfile);
    }

    private void verificarDuplicidadeJurado(Jurado jurado) throws Exception {
        for (Jurado j : jurados)
            if (j.nome.equals(jurado.nome))
                throw new Exception("Jurado já foi registrado.");
    }

    private void verificarDuplicidadeEscola(Escola escola) throws Exception {
        for (Escola e : escolas)
            if (e.nome.equals(escola.nome))
                throw new Exception("Escola já foi registrada.");
    }

    private void verificarDuplicidadeDesfile(Desfile desfile) throws Exception {
        for (Desfile d : desfiles)
            if (d.carnaval == desfile.carnaval && d.escola == desfile.escola)
                throw new Exception("Escola já foi registrada.");
    }

    private void verificarLimiteJurados(Jurado jurado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
