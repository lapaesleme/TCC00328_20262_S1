package uff.ic.lleme.tcc00328.trabalhos.luizandre.aula;

public class ListaDeNos<E> {

    private No primeiro = null;

    private class No {

        public E conteudo;
        public No proximo;

        public No(E conteudo) {
            this.conteudo = conteudo;
        }
    }

    public void adicionar(E n) {
        if (primeiro == null)
            primeiro = new No(n);
        else {
            No novoNo = new No(n);
            novoNo.proximo = primeiro;
            primeiro = novoNo;
        }

    }

    public E obter(int index) {
        return null;
    }

}
