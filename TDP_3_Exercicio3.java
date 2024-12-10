
package com.mycompany.tdp_3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Exercicio3 {

    int intervalo = 0;
    String a = "";

    public void NumerosPrimos() {
        try {
            a = JOptionPane.showInputDialog(null, "Digite o intervalo de pares");
            intervalo = Integer.parseInt(a);

            List<String> pares = new ArrayList<String>();
//          
            for (int i = 0; i <= intervalo; i++) {
                if (i % 1 == 0 && i % i == 0) {
                    pares.add(Integer.toString(i));
                }
            }

            JOptionPane.showMessageDialog(null, pares);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido 😡 ", "NUMEROS APENAS", JOptionPane.WARNING_MESSAGE);
            NumerosPrimos();
        }
    }
}
