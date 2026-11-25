package uff.ic.lleme.tcc00328.provas.vs;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Desfile {

    public Carnaval carnaval = null;
    public Escola escola = null;
    public Map<Quesito, Set<Nota>> notas = null;

    private Desfile() {
    }

    public Desfile(Carnaval carnaval, Escola escola) {
        this.carnaval = carnaval;
        this.escola = escola;
    }

    public void registrarNota(Nota nota) throws Exception {
        if (carnaval.jurados.contains(nota.jurado))
            if (carnaval.escolas.contains(nota.escola))
                if (nota.carnaval == carnaval && nota.escola == escola)
                    if (!notas.containsKey(nota.quesito)) {
                        Set<Nota> notas = new HashSet<>();
                        notas.add(nota);
                        this.notas.put(nota.quesito, notas);
                    } else
                        this.notas.get(nota.quesito).add(nota);
                else
                    throw new Exception("Nota do desfile incorreto.");
            else
                throw new Exception("Escola não participa do carnaval.");
        else
            throw new Exception("Jurado não participa da comissão julgadora.");

    }

}
