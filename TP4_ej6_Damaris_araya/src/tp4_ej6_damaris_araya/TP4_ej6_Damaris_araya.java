/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_ej6_damaris_araya;

import java.util.Scanner;

public class TP4_ej6_Damaris_araya {

    
    public static void main(String[] args) {
         Scanner lector = new Scanner(System.in);

        int[] numeros = new int[10];


        int positivos = 0;

        int negativos = 0;

        int ceros = 0;


        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese un numero entero: ");

            numeros[i] = lector.nextInt();

        }


        for (int i = 0; i < 10; i++) {

            if (numeros[i] > 0) {

                positivos++;

            } else if (numeros[i] < 0) {

                negativos++;

            } else {

                ceros++;

            }

        }

        System.out.println("Cantidad de positivos: " + positivos);

        System.out.println("Cantidad de negativos: " + negativos);

        System.out.println("Cantidad de ceros: " + ceros);

    }

    

}
    
   

