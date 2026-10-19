package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista2.ex3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Luiz");
        lista.add("André");

        System.out.println(buscar(lista, "André"));

        List<Aluno> lista2 = new LinkedList<>();
        lista2.add(new Aluno(1, "Luiz"));
        lista2.add(new Aluno(2, "André"));

        Aluno a = new Aluno(2, "André");

        System.out.println(buscar(lista2, a));

    }

    public static <T> int buscar(List<T> lista, T elemento) {
        int pos = -1;
        for (T elem : lista) {
            pos++;
            if (elem.equals(elemento))
                return pos;
        }
        return -1;
    }

}
