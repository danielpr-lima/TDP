package com.mycompany.td_02;

import java.util.Scanner;

public class Exercicio3 {
    
//3º) Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor  da  compra  for menor  que  R$20,00;  
//    caso  contrário,  o  lucro  será de 30%.  Entrar com o valor do produto e imprimir o valor da venda.
    
     Scanner scanner = new Scanner(System.in);
    
    public void CalcularDesconto() {
        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        
        if (valor < 20.0) {
            valor *= 1.45;
        } else {
            valor *= 1.30;
        }
        
        System.out.println(valor);
    }

}
