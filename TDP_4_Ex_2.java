/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdp_4;
import javax.swing.*;

/**
 *
 * @author labs
 */
public class Ex_2 {
    public double saldoConta() {
        
        double saldoAtual = 0;
                
        
        try{
            int conta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta:"));
            double saldo = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o saldo da conta"));
            double debito = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o debito da conta"));
            double credito = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o credito da conta"));

            saldoAtual = saldo-debito+credito;

            if(saldoAtual < 0 )
            {
                JOptionPane.showMessageDialog(null, "Saldo negativo " , "SALDO", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Saldo positivo " , "SALDO", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite um número válido 😡 ", "NUMEROS APENAS", JOptionPane.WARNING_MESSAGE);
            saldoConta();
        }

        return saldoAtual;
    }
}
