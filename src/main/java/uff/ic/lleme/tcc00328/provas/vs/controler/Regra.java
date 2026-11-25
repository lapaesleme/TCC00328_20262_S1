package uff.ic.lleme.tcc00328.provas.vs.controler;

import java.util.List;
import uff.ic.lleme.tcc00328.provas.vs.Carnaval;
import uff.ic.lleme.tcc00328.provas.vs.Quesito;

public interface Regra {

    public abstract List<Resultado> calcularResultado(Carnaval carnaval);

    public abstract void registrarQuesitoDesempate(Quesito quesito);
}
