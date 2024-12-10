/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdp_4;

import javax.swing.*;

public class Ex_1 {

    double preco;
    int qtd;
    String nome;
    double valorTotal;

    public double calcularValor() {

        try {
            nome = JOptionPane.showInputDialog(null, "Digite o nome do produto: ");
            preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto:"));
            qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade"));

            if (qtd <= 10) {
                //10
                valorTotal = (preco * qtd);
            } else if (qtd <= 20) {
                //11a20
                valorTotal = (preco * qtd) * 0.9;
            } else if (qtd <= 50) {
                //21a50
                valorTotal = (preco * qtd) * 0.80;
            } else {
                //50
                valorTotal = (preco * qtd) * 0.75;
            }
                JOptionPane.showMessageDialog(null, "O valor fica: " + valorTotal, "VALOR TOTAL", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas numeros!!", "Numeros apenas", JOptionPane.WARNING_MESSAGE);
            calcularValor();
        }

        return valorTotal;
    }
}
