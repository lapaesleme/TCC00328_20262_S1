package uff.ic.lleme.tcc00328.trabalhos.luizandre.academico;

public class Main {

    public static void main(String[] args) {
        AlunoRegular a1 = new AlunoRegular(123, "Luiz");

        Aluno aluno = a1;
        Integer v1 = 6;
        Integer v2 = 2 * 3;
        System.out.println(v1 == v2);
        String s1 = "s2";
        String s2 = "s" + "2";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(aluno.toString());
        AlunoRegular2 a2 = (AlunoRegular2) aluno;

    }
}
