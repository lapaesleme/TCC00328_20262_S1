package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista2.ex1;

public interface Caixa<T> {

    public void guardar(T obj);

    public T obter();

    public boolean estaVazia();
}
