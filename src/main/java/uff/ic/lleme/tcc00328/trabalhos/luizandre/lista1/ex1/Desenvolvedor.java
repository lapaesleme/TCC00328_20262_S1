package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista1.ex1;

public class Desenvolvedor extends Funcionario {

    public int qtd;

    @Override
    public double calcularSalario() {
        return getSalario() * (1 + qtd * 0.02);
    }
}
