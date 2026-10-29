package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista2.ex7;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Aluno> lista2 = new LinkedList<>();
        lista2.add(new Aluno(1, "Luiz"));

        Aluno a = new Aluno(2, "André");
        lista2.add(a);
        lista2.add(a);

        List<Aluno> novaLista = removerDuplicatas2(lista2);

        System.out.println("terminou");

    }

    public static <T> List<T> removerDuplicatas(List<T> lista) {
        List<T> novaLista = new LinkedList<>();
        for (T elem : lista)
            if (!novaLista.contains(elem))
                novaLista.add(elem);
        return novaLista;
    }

    public static <T> List<T> removerDuplicatas2(List<T> lista) {
        Set<T> set = new LinkedHashSet<>();
        for (T elem : lista)
            set.add(elem);
        List<T> novaLista = new LinkedList<>(set);

        return novaLista;
    }

}
