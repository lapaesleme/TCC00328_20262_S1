package uff.ic.lleme.tcc00328.trabalhos.luizandre.aula;

public class ColecaoDeInteiros {

    private Integer[] lista = new Integer[10];
    private int pos = -1;

    public void adicionar(int n) {
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

    public Integer obter(int indice) throws ArrayIndexOutOfBoundsException {
        if (indice >= 0 && indice <= pos)
            return lista[indice];
        else
            throw new ArrayIndexOutOfBoundsException();

    }

    private void aumentarLista() {
        Integer[] novaLista = new Integer[lista.length + 10];
        int pos = 0;
        for (Integer n : lista)
            if (n != null)
                novaLista[pos++] = n;
        lista = novaLista;
    }
}
