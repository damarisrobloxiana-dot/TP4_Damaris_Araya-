/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4.ej8_damaris_araya;

import java.util.Scanner;
public class TP4EJ8_Damaris_araya {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String[] nombres = new String[3];
        double[] sueldos = new double[3];
        double mayorSueldo = 0;
        String nombreMayor = null;
        for (int num1 = 0; num1 < 3; num1++) {
            System.out.print("Ingrese el nombre del empleado: ");
            nombres[num1] = teclado.next();
            System.out.print("Ingrese el sueldo: ");
            sueldos[num1] = teclado.nextDouble();
            if (num1 == 0) {
                mayorSueldo = sueldos[num1];
                nombreMayor = nombres[num1];
            } else {
                if (sueldos[num1] > mayorSueldo) {
                    mayorSueldo = sueldos[num1];
                    nombreMayor = nombres[num1];
                }
            }
        }
        System.out.println("Empleado con mayor sueldo:");
        System.out.println("Nombre: " + nombreMayor);
        System.out.println("Sueldo: " + mayorSueldo);
        


    }
    
}
