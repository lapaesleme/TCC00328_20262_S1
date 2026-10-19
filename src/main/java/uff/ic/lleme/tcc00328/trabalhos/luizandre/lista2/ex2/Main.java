package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista2.ex2;

import uff.ic.lleme.tcc00328.trabalhos.luizandre.academico.AlunoRegular;

public class Main {

    public static void main(String[] args) {
        AlunoRegular al = new AlunoRegular(123, "Luiz");
        Par<Integer, AlunoRegular> par = new Par(al.getMatricula(), al);

        System.out.println(par.toString());
    }
}
