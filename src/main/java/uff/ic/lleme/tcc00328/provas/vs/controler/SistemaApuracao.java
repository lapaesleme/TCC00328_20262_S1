package uff.ic.lleme.tcc00328.provas.vs.controler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uff.ic.lleme.tcc00328.provas.vs.Carnaval;
import uff.ic.lleme.tcc00328.provas.vs.Desfile;
import uff.ic.lleme.tcc00328.provas.vs.Escola;
import uff.ic.lleme.tcc00328.provas.vs.Jurado;
import uff.ic.lleme.tcc00328.provas.vs.Nota;
import uff.ic.lleme.tcc00328.provas.vs.Quesito;

public class SistemaApuracao {

    private static final Map<Integer, Carnaval> APURACOES = new HashMap<>();
    public static Regra regra = null;

    private SistemaApuracao() {
    }

    public static Carnaval registrarNovoCarnaval(int ano) throws Exception {
        Carnaval carnaval = new Carnaval();
        if (!APURACOES.containsKey(ano)) {
            APURACOES.put(carnaval.ano, carnaval);
            return carnaval;
        } else
            throw new Exception();
    }

    public static Jurado registrarNovoJurado(Carnaval carnaval, String nome, Quesito quesito) throws
            Exception {
        Jurado jurado = new Jurado(nome, quesito);
        carnaval.registrarJurado(jurado);
        return jurado;
    }

    public static Desfile registrarNovoDesfile(Carnaval carnaval, Escola escola) throws
            Exception {
        Desfile desfile = new Desfile(carnaval, escola);
        carnaval.registrarDesfile(desfile);
        return desfile;
    }

    public static Nota registrarNota(Desfile desfile, Quesito quesito, Jurado jurado, float valor) throws
            Exception {
        Nota nota = new Nota(desfile.carnaval, desfile.escola, quesito, jurado, valor);
        desfile.registrarNota(nota);
        return nota;
    }

    public static Escola registrarNovaEscola(Carnaval carnaval, String nome) throws
            Exception {
        Escola escola = new Escola(nome);
        carnaval.registrarEscola(escola);
        return escola;
    }

    public static List<Resultado> computarResulado(Carnaval carnaval) {
        List<Resultado> resultados = regra.calcularResultado(carnaval);
        return resultados;
    }
}
