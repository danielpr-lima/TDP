/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tdp_3;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class TDP_3 {

    public static void main(String[] args) {
        String resp = "";

        resp = JOptionPane.showInputDialog(null, "Qual exercício deseja executar?");

        switch (resp) {
            case "1":
                Exercicio1 ex1 = new Exercicio1();
                ex1.NumerosPares();
            case "2":
                Exercicio2 ex2 = new Exercicio2();
                ex2.Fibonacci();
                break;
            case "3":
                Exercicio3 ex3 = new Exercicio3();
                ex3.NumerosPrimos();
                break;
            case "4":
              Exercicio4 ex4 = new Exercicio4();
              ex4.calcularNotaFinal();
              break;
            case "5":
              Exercicio5 ex5 = new Exercicio5();
              ex5.Incremento();
              break;
            default:
                JOptionPane.showMessageDialog(null, "Este exercício não existe", "Exercicio inexistente", JOptionPane.WARNING_MESSAGE);
                main(args);
        }

    }
}

