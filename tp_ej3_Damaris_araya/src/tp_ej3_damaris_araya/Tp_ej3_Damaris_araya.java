/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_ej3_damaris_araya;

import java.util.Scanner;
public class Tp_ej3_Damaris_araya {

    
    public static void main(String[] args) {
     int vector[]= new int[10];
       int suma=0;
       Scanner lector=new Scanner(System.in);
       for (int i=0; i<10; i++){
           System.out.println("Numero: ");
            vector[i]=lector.nextInt();
            if (i%2==0){
                suma+=vector[i];
            }
       }
       System.out.println(suma/5);
    }
}

    
    

