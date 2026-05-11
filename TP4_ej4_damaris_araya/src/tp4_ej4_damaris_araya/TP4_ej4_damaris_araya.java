/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_ej4_damaris_araya;

import java.util.Scanner;
public class TP4_ej4_damaris_araya {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidad = lector.nextInt();

        double[] notas = new double[cantidad];

        double suma = 0;
        double media;

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = lector.nextDouble();
        }
        for (int i = 0; i < cantidad; i++) {

            suma += notas[i];
        }
        media = suma / cantidad;

        System.out.println("La nota media es: " + media);

        System.out.println("Alumnos con nota superior a la media:");

        for (int i = 0; i < cantidad; i++) {

            if (notas[i] > media) {

                System.out.println("Alumno " + (i + 1) + " = Nota: " + notas[i] );
            }
        }
    }
    }

    
    

