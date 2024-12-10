/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tdp_4;
import javax.swing.*;

/**
 *
 * @author labs
 */
public class Tdp_4 {

    public static void main(String[] args) {
        
       String resp = JOptionPane.showInputDialog(null, "Qual exercício deseja executar?");
       
       switch (resp) {
            case "1":
                Ex_1 ex1 = new Ex_1();
                ex1.calcularValor();
                break;
                
            case "2":
                Ex_2 ex2 = new Ex_2();
                ex2.saldoConta();
                break;
                
            case "3":
                Ex_3 ex3 = new Ex_3();
                ex3.triangulo();
                break;
                
            case "4":
              Ex_4 ex4 = new Ex_4();
              double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura"));
              String sexo = JOptionPane.showInputDialog(null,"Digite M para masculino ou F para femenino:");
              ex4.calcularPesoIdeal(altura,sexo);
              break;
                
            case "5":
              Ex_5 ex5 = new Ex_5();
              ex5.calcularTaxa();
              break;
              
            case "6": 
              Ex_6 ex6 = new Ex_6();
              ex6.calcularTabuada();
              break;
              
            default:
                JOptionPane.showMessageDialog(null, "Este exercício não existe", "Exercicio inexistente", JOptionPane.WARNING_MESSAGE);
                main(args);
        }
    }
}
