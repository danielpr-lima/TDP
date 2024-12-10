/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.td_02;

import java.util.Scanner;



public class TD_02 {

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do exercício que deseja executar:");
        int exercicio = scanner.nextInt();

        switch (exercicio) {
            case 1:
                Exercicio1 ex1 = new Exercicio1();
                ex1.MultiploDeTres();
                break;
            case 2:
                Exercicio2 ex2 = new Exercicio2();
                ex2.OrdemCrescente();
                break;
            case 3:
                Exercicio3 ex3 = new Exercicio3();
                ex3.CalcularDesconto();
                break;
            case 4:
                Exercicio4 ex4 = new Exercicio4();
                ex4.IdadeEleitoral();
                break;
            case 5:
                Exercicio5 ex5 = new Exercicio5();
                ex5.planoDeSaude();
                break;
            default:
                System.out.println("Exercício não encontrado.");
                break;
        }

    }
}
