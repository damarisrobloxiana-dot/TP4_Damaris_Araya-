/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_damaris_araya;

import java.util.Scanner;


public class TP4_Ej1_damaris_Araya {

    
    public static void main(String[] args) {
       int [] vector = new int[7];
       Scanner lector= new Scanner(System.in);
       int a=0;
       for (int i=0; i<7; i++){
           System.out.println("Numero: ");
           vector[i]=lector.nextInt();
       }
       while (a<7){
           System.out.println(vector[a]);
           a++;
       }
    }
    
}
