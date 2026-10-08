package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista1.ex1;

public class Main {

    public static void main(String[] args) {
        Estagiario estagiario = new Estagiario();
        estagiario.setSalario(234);
        estagiario.projetos = 10;
        Gerente ger = new Gerente();
        ger.setSalario(1000);
        ger.setTempoTrabalho(5);
        Desenvolvedor des = new Desenvolvedor();
        des.setSalario(500);
        des.qtd = 10;

        Funcionario[] colecao = new Funcionario[3];
        colecao[0] = estagiario;
        colecao[1] = ger;
        colecao[2] = des;

        for (Funcionario f : colecao)
            System.out.println(f.calcularSalario());
    }

}
