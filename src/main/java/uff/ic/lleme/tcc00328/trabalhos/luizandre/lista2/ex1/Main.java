package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista2.ex1;

import uff.ic.lleme.tcc00328.trabalhos.luizandre.academico.Aluno;
import uff.ic.lleme.tcc00328.trabalhos.luizandre.academico.AlunoRegular;

public class Main {

    public static void main(String[] args) {
        String str = "Luiz";
        Caixa<String> cs = new CaixaImpl<>(str);
        System.out.println(cs.obter());

        Caixa<Integer> ci = new CaixaImpl<>(23);
        System.out.println(ci.obter());

        Caixa<Aluno> ca = new CaixaImpl<>(new AlunoRegular(123, "Luiz"));
        System.out.println(ca.obter());

    }
}
