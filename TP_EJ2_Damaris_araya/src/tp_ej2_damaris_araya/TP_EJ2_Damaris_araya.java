/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_ej2_damaris_araya;

import java.util.Scanner;

public class TP_EJ2_Damaris_araya {

    
    public static void main(String[] args) {
        int[] numeros = new int[10];
       Scanner lector= new Scanner(System.in);
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
            for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese un numero: ");
            numeros[i] = lector.nextInt();

            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            }
            else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            }
        }
        double promedioPositivos = 0;
        double promedioNegativos = 0;
        if (contadorPositivos > 0) {
            promedioPositivos = (double) sumaPositivos / contadorPositivos;
        }
        if (contadorNegativos > 0) {
            promedioNegativos = (double) sumaNegativos / contadorNegativos;
        }
        System.out.println("Promedio positivos: " + promedioPositivos);
        System.out.println("Promedio negativos: " + promedioNegativos);
    

    }
    
}
