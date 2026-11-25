package uff.ic.lleme.tcc00328.provas.vs;

public class Nota {

    public Carnaval carnaval = null;
    public Escola escola = null;
    public Quesito quesito = null;
    public Jurado jurado = null;
    public float valor = 0;

    private Nota() {
    }

    public Nota(Carnaval carnaval, Escola escola, Quesito quesito, Jurado jurado, float valor) throws Exception {
        verificarHbilitacaoJurado(jurado, quesito);
        this.carnaval = carnaval;
        this.escola = escola;
        this.quesito = quesito;
        this.jurado = jurado;
        this.valor = valor;
    }

    private void verificarHbilitacaoJurado(Jurado jurado, Quesito quesito) throws
            Exception {
        if (jurado.quesito != quesito)
            throw new Exception("Jurado não habilitado para o quesito");
    }
}
