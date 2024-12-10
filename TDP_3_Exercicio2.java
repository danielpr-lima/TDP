/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdp_3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author labs
 */
public class Exercicio2 {

    public void Fibonacci() {
        int ant = 1, atual = 1, prox = 0;

        String n = "0";
        List<String> iteracoes = new ArrayList<String>();

        try {
            n = JOptionPane.showInputDialog(null, "Até qual casa do fibonacci você deseja?");

            for (int i = 0; i < Integer.parseInt(n); i++) {
                iteracoes.add(Integer.toString(ant));
                prox = atual + ant;
                ant = atual;
                atual = prox;

            }

            JOptionPane.showMessageDialog(null, iteracoes);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido 😡 ", "NUMEROS APENAS", JOptionPane.WARNING_MESSAGE);
            Fibonacci();
        }

    }

}
