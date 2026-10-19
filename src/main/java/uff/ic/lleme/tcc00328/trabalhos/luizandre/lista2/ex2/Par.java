package uff.ic.lleme.tcc00328.trabalhos.luizandre.lista2.ex2;

public class Par<K, V> {

    K id = null;
    V conteudo = null;

    public Par(K id, V conteudo) {
        this.id = id;
        this.conteudo = conteudo;
    }

    public K getId() {
        return id;
    }

    public void setId(K id) {
        this.id = id;
    }

    public V getConteudo() {
        return conteudo;
    }

    public void setConteudo(V conteudo) {
        this.conteudo = conteudo;
    }

    public String toString() {
        return "(" + id.toString() + "," + conteudo.toString() + ")";
    }

}
