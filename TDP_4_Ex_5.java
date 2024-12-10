/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdp_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Ex_5 {
    
    public double calcularTaxa(){
        try{
            int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano do veiculo:"));
            double preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do veiculo"));
            double taxa;
            if(ano >= 1990)
            {
                taxa = preco*0.015;
            }
            else
            {
                taxa = preco*0.01;
            }
            JOptionPane.showMessageDialog(null, "imposto a ser pago: " + taxa, " kg", JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite um número válido 😡 ", "NUMEROS APENAS", JOptionPane.WARNING_MESSAGE);
            calcularTaxa();
        }
        return 0.0;
    }
}