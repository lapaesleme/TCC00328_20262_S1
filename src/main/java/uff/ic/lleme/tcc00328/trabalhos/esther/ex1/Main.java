
package com.mycompany.projectsesther.ex1;

/**
Um banco precisa de um pequeno sistema para gerir os seus clientes e as respetivas contas bancárias. 
* O objetivo é criar a estrutura inicial onde um
* cliente está associado a uma conta, e a conta pode realizar operações básicas de movimentação de dinheiro.
 */


public class Main {
 
    public static void main (String args[]){
        
        
        //vamos abrir uma conta
        Conta conta1 = new Conta(121456, "Joana", 32.789);
        Conta conta2 = new Conta(987456, "Lucas", 15.963);
        
        //criando 2 clientes diferentes
        Cliente cliente1 = new Cliente("Joana", 123456789, "Dentista", conta1);
        Cliente cliente2 = new Cliente("Lucas", 145789149, "Professor", conta2);
        
        conta1.depositar(10.900);
        conta2.sacarValor(16.000);
        conta1.transferir(20.500, conta2);
        conta1.exibirResumo();
        conta2.exibirResumo();
        
        
    }
    
    
}
