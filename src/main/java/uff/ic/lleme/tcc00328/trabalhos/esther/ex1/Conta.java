/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectsesther.ex1;

/**
 *
 * @author User
 */
public class Conta {
    
    
    private final int numeroConta;
    private final String titular; //A palavra final no Java significa que algo é definitivo (uma constante). Quando você coloca final em um atributo, você está dizendo ao Java: "Depois que eu der um valor para essa variável pela primeira vez (no construtor), ela nunca mais poderá ser alterada".
    private double saldo;
    
    public  Conta (int numeroConta, String titular,double saldo){ //construtor nunca declara retorno
        this.numeroConta= numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //Como o atributo saldo pertence à ContaBancaria, é responsabilidade total 
    //da conta validar as regras (como checar se há dinheiro suficiente) e modificar esse valor
    
    //um objeto cuida dos seus próprios dados!!!
    
    /**
     * @return the numeroConta
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }
    
    
    //metodos:

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor; // Operador correto para somar
            return true;
        } else { // Sintaxe correta das chaves
            System.out.println("Valor de depósito inválido.");
            return false;
        }
    }

    public boolean sacarValor(double valor) {
        if (valor <= saldo && valor > 0) { // O valor do saque tem que ser menor/igual ao saldo
            saldo -= valor; // Operador correto para subtrair
            return true;
        } else {
            System.out.println("Valor de saque inválido.");
            return false;
        }
    }
    
    public boolean transferir(double valor, Conta contaDestino) {
    // Tenta sacar desta conta (this). Se o método retornar true, prossegue com o depósito.
        if (this.sacarValor(valor)) { 
            contaDestino.depositar(valor);
            return true;
        }
        return false; // Falhou na transferência por falta de saldo
    }
    
    public void exibirResumo() {
    System.out.println("Conta: " + numeroConta + " | Titular: " + titular + " | Saldo atual: " + saldo);
    }
}
