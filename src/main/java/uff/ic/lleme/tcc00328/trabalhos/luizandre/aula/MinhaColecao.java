package uff.ic.lleme.tcc00328.trabalhos.luizandre.aula;

public class MinhaColecao<E> {

    private Object[] lista = new Object[10];
    private int pos = -1;

    public void adicionar(E n) {
        if (pos < lista.length - 1)
            lista[++pos] = n;
        else {
            aumentarLista();
            lista[++pos] = n;
        }
    }

    public void remover(int indice) {
        if (pos >= 0)
            if (indice == pos) {
                lista[indice] = null;
                pos--;
            } else if (indice < pos)
                lista[indice] = lista[pos--];
    }

    public E obter(int indice) throws ArrayIndexOutOfBoundsException {
        if (indice >= 0 && indice <= pos)
            return (E) lista[indice];
        else
            throw new ArrayIndexOutOfBoundsException();

    }

    private void aumentarLista() {
        Object[] novaLista = new Object[lista.length + 10];
        int pos = 0;
        for (Object n : lista)
            if (n != null)
                novaLista[pos++] = n;
        lista = novaLista;
    }
}
