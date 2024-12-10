package com.mycompany.td_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Exercicio2 {

//    2º) Ler três números e mostrá-los em ordem crescente.
    
    public void OrdemCrescente() {

        List lista = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um valor");
            lista.add(scanner.nextInt());
        }

        Collections.sort(lista);

        System.out.println(lista);

    }
}
