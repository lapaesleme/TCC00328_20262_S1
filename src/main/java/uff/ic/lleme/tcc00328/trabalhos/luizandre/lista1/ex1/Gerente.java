package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista1.ex1;

public class Gerente extends Funcionario {

    @Override
    public double calcularSalario() {
        return getSalario() * (1 + getTempoTrabalho() * 0.05);
    }
}
