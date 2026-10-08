package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista1.ex1;

public class Estagiario extends Funcionario {

    public int projetos;

    @Override
    public double calcularSalario() {
        return getSalario() * (1 + projetos * 0.01);
    }

}
