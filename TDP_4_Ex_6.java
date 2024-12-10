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
public class Ex_6 {
    public int calcularTabuada(){
        try {
            int tabu = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero da tabuada: "));
            int soma = 0;

            for(int i = 1; i <= 10; i++){
                soma = (i*tabu) + soma;
            }

            JOptionPane.showMessageDialog(null, "O resultado da soma da tabuada e:" + soma,"Resultado", JOptionPane.INFORMATION_MESSAGE);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite apenas numeros!!", "Numeros apenas", JOptionPane.WARNING_MESSAGE);
        }
        
        return 0;
    }
}
