/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdp_4;

import javax.swing.*;

/**
 *
 * @author Daniel
 */
public class Ex_4 {
     public void calcularPesoIdeal(double altura, String sexo) {
        double pesoIdeal;
        try{
            if (sexo.equalsIgnoreCase("m")) {
                pesoIdeal = (72.7 * altura) - 58;
            } else if (sexo.equalsIgnoreCase("f")) {
                pesoIdeal = (62.1 * altura) - 44.7;
            } else {
                JOptionPane.showMessageDialog(null, "Digite apenas M ou F!!", "Sexo", JOptionPane.WARNING_MESSAGE);
                return;
            }
             JOptionPane.showMessageDialog(null, "O peso ideal é: " + pesoIdeal, " kg", JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas numeros!!", "Numeros apenas", JOptionPane.WARNING_MESSAGE);
        }
    }
}
