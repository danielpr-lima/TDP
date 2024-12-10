package com.mycompany.tdp_3;

import javax.swing.JOptionPane;


public class Exercicio4 {


    public void calcularNotaFinal() {

        try {
            double P1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira prova (P1):"));
            double P2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda prova (P2):"));
            double T = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho (T):"));
            double somaNotas = P1 * 0.35 + P2 * 0.35 + T * 0.3;

            if (somaNotas < 6.0) {
                JOptionPane.showMessageDialog(null, somaNotas + ", O aluno não atingiu a nota necessária.");
                double P3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da P3:"));
                double menorNota = Math.min(P1, P2);
                somaNotas -= menorNota;
                somaNotas += P3;
                somaNotas = somaNotas * 0.35 + T * 0.3;
            }

            JOptionPane.showMessageDialog(null, "A nota final é: " + String.format("%.2f", somaNotas) + ((somaNotas > 6.0) ? " (Aprovado)" : " (Reprovado)"));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido 😡 ", "NUMEROS APENAS", JOptionPane.WARNING_MESSAGE);
            calcularNotaFinal();
        }
    }
}
