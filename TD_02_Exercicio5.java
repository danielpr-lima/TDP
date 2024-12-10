package com.mycompany.td_02;

import java.util.Scanner;

public class Exercicio5 {

    Scanner scanner = new Scanner(System.in);

    public void planoDeSaude() {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        double valorPlano = calcularValorPlano(idade);

        System.out.println(nome + " deverá pagar R$ " + valorPlano + " pelo plano de saúde.");
    }

    private double calcularValorPlano(int idade) {
        double valor;

        if (idade <= 10) {
            valor = 30.00;
        } else if (idade <= 29) {
            valor = 60.00;
        } else if (idade <= 45) {
            valor = 120.00;
        } else if (idade <= 59) {
            valor = 150.00;
        } else if (idade <= 65) {
            valor = 250.00;
        } else {
            valor = 400.00;
        }

        return valor;
    }

    public static void main(String[] args) {
        Exercicio5 exercicio5 = new Exercicio5();
        exercicio5.planoDeSaude();
    }
}
