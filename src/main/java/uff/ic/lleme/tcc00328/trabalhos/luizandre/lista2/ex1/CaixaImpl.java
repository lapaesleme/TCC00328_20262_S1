package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista2.ex1;

public class CaixaImpl<T> implements Caixa<T> {

    T conteudo = null;

    public CaixaImpl(T obj) {
        conteudo = obj;
    }

    @Override
    public void guardar(T obj) {
        conteudo = obj;
    }

    @Override
    public T obter() {
        return conteudo;
    }

    @Override
    public boolean estaVazia() {
        return conteudo == null;
    }

}
