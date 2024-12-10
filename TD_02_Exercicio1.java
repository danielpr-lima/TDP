package com.mycompany.td_02;

import java.util.Scanner;

public class Exercicio1 {

//1º) Ler um valor e informar se ele é ou não múltiplo de 3.
 
    public void MultiploDeTres() {
        
        Scanner scanner = new Scanner(System.in);
        
        int valor;
        System.out.println("Digite um valor: ");
        valor = scanner.nextInt();
        
        if (valor % 3 == 0) {
            System.out.println("O valor digitado é multiplo de 3");
        } else {
            System.out.println("O valor digitado não é multiplo de 3");
        }
    }
}
