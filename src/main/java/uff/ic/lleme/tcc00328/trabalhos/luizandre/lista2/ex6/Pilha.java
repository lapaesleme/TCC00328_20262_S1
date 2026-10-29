package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista2.ex6;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha<T> {

    private Deque<T> pilha = new ArrayDeque<>();

    public void empilhar(T obj) {
        pilha.addLast(obj);
    }

    public T desempilhar() {
        return pilha.removeLast();
    }

    public T topo() {
        return pilha.getLast();
    }

    public int tamanho() {
        return pilha.size();
    }

    public boolean estaVazia() {
        return pilha.isEmpty();
    }
}
