
package uff.ic.lleme.tcc00328.trabalhos.AndersonMuniz.Ex4.data;

import java.util.Random;

// Criamos o objeto "Dado"
class Dado {
    // Todo dado guarda o número que caiu nele
    int valor;
    Random gerador = new Random();

    // Esta ação faz o dado girar e escolher um número de 1 a 6
    void rolar() {
        this.valor = gerador.nextInt(6) + 1;
    }
}
