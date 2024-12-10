package com.mycompany.tdp_3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {

    public void Incremento() {

        try {
            List<String> valores = new ArrayList<>();
            int limite = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual deverá ser o número limite:"));
            int intervalo = Integer.parseInt((JOptionPane.showInputDialog(null, "Digite o intervalo que deverá ter entre cada número:")));

            if (intervalo <= 0 || limite <= 0) {
                JOptionPane.showMessageDialog(null, "Valores Inválidos!");
                Incremento();
            } else {
                for (int i = 0; i <= limite; i += intervalo) {
                    valores.add(Integer.toString(i));
                }
                JOptionPane.showMessageDialog(null, valores);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido 😡 ", "NUMEROS APENAS", JOptionPane.WARNING_MESSAGE);
            Incremento();
        }


    }

}
