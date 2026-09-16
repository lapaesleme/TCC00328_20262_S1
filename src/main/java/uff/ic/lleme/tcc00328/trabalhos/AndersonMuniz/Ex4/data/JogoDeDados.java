
package uff.ic.lleme.tcc00328.trabalhos.AndersonMuniz.Ex4.data;

class JogoDeDados {
    // O jogo precisa de dois dados para funcionar
    Dado dado1 = new Dado();
    Dado dado2 = new Dado();
    int ponto;

    // Esta ação calcula a soma dos dois dados
    int pegarSoma() {
        return dado1.valor + dado2.valor;
    }

    // Esta ação joga os dois dados ao mesmo tempo e mostra o resultado
    void lancarDados(String tipoLancamento) {
        dado1.rolar();
        dado2.rolar();
        System.out.println(tipoLancamento + ": " + dado1.valor + " + " + dado2.valor + " = " + pegarSoma());
    }

    // Aqui começamos a rodar o jogo de verdade
    void iniciar() {
        // Primeiro lançamento
        lancarDados("Primeiro lançamento");
        int somaInicial = pegarSoma();

        // Regras iniciais
        if (somaInicial == 7 || somaInicial == 11) {
            System.out.println("Parabéns! Você ganhou direto!");
        } 
        else if (somaInicial == 2 || somaInicial == 3 || somaInicial == 12) {
            System.out.println("Que pena! Você perdeu direto!");
        } 
        else {
            // Se não ganhou nem perdeu, define o Ponto
            this.ponto = somaInicial;
            System.out.println("Seu PONTO é: " + this.ponto + ". Continue jogando...");

            // Ciclo de novos lançamentos
            while (true) {
                lancarDados("Novo lançamento");
                int novaSoma = pegarSoma();

                if (novaSoma == this.ponto) {
                    System.out.println("Você acertou seu Ponto! Você GANHOU!");
                    break; // Fim do jogo
                } 
                else if (novaSoma == 7) {
                    System.out.println("Você tirou um 7! Você PERDEU!");
                    break; // Fim do jogo
                }
            }
        }
    }
}
