package uff.ic.lleme.tcc00328.trabalhos.luizandre.aula;

public class ListaDeNos {

    private No primeiro = null;

    private class No {

        public int conteudo;
        public No proximo;

        public No(int conteudo) {
            this.conteudo = conteudo;
        }
    }

    public void adicionar(int n) {
        if (primeiro == null)
            primeiro = new No(n);
        else {
            No novoNo = new No(n);
            novoNo.proximo = primeiro;
            primeiro = novoNo;
        }

    }

}
