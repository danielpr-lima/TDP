package com.mycompany.tdp_3;

import java.util.Scanner;
import java.util.*;
import javax.swing.*;

public class Exercicio1 {

    Scanner scanner = new Scanner(System.in);

    int intervalo = 0;
    String a = "";

    public void NumerosPares() {

        try {
            a = JOptionPane.showInputDialog(null, "Digite o intervalo de pares");
            intervalo = Integer.parseInt(a);

            List<String> pares = new ArrayList<String>();
//          
            for (int i = 0; i <= intervalo; i++) {
                if (i % 2 == 0) {
                    pares.add(Integer.toString(i));
                }
            }

            JOptionPane.showMessageDialog(null, pares);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido 😡 ", "NUMEROS APENAS", JOptionPane.WARNING_MESSAGE);
            NumerosPares();
        }

    }

}
