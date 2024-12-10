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
public class Ex_3 {
    public int triangulo () {
        
        try{
            int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o lado x: "));
            int y = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o lado y: "));
            int z = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o lado z: "));

            if (x + y > z && x + z > y && y + z > x){
                if(x == y  && x == z){
                    JOptionPane.showMessageDialog(null, "O trigulo e equilatero " , "Triangulo", JOptionPane.INFORMATION_MESSAGE);

                }else if(x != y && x != z &&  z != y){
                    JOptionPane.showMessageDialog(null, "O trigulo e escaleno " , "Triangulo", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "trigulo e isosceles " , "Triangulo", JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "O valores nao condizem com um de triangulo " , "Triangulo", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite um número válido 😡 ", "NUMEROS APENAS", JOptionPane.WARNING_MESSAGE);
            triangulo();
        }
        return 0;  
    }
    
}
