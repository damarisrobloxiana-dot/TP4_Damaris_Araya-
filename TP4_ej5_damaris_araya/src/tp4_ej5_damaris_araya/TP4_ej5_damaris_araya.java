/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_ej5_damaris_araya;

import java.util.Scanner;

public class TP4_ej5_damaris_araya {

    
    
    public static void main(String[] args) {
          Scanner lector = new Scanner(System.in);
      int[] pares = new int[20];

        int numero = 2;

        for (int i = 0; i < 20; i++) {

            pares[i] = numero;
            numero += 2;
        }
        System.out.println("Numeros pares:");

        for (int i = 0; i < 20; i++) {

        System.out.println(pares[i]);
        
    }
}
}

    
    


