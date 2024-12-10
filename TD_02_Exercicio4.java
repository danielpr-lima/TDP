package com.mycompany.td_02;

import java.util.Scanner;

public class Exercicio4{
    
//      4º) Ler a  idade de uma pessoa e informar a suaclasse eleitoral:
//          Não-eleitor (abaixo de 16 anos)
//          Eleitor obrigatório(entre 18 e 65 anos)
//          Eleitor facultativo(entre 16 e 18 anos e maior de 65 anos)


     Scanner scanner = new Scanner(System.in);
    
    public void IdadeEleitoral() {
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        
       if (idade < 16) {
            System.out.println("Idade eleitoral: Não-eleitor (Abaixo de 16 anos)");
       } else if (idade >= 18 || idade <= 65) {
            System.out.println("Idade eleitoral: Eleitor obrigatório (Entre 18 e 65 anos)");
       } else  if ((idade >= 16 || idade < 18 ) || (idade > 65)) {
            System.out.println("Idade eleitoral: Eleitor facultativo (Entre 16 e 18 anos e maior de 65 anos)");
       } else {
           
       }
       
       
       
      
        
        System.out.println(idade);
    }

}
