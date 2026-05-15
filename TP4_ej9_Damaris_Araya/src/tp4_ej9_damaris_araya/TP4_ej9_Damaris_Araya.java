
package tp4_ej9_damaris_araya;

import java.util.Scanner;
public class TP4_ej9_Damaris_Araya {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        boolean[] pagos = new boolean[10];
        int pagosRealizados = 0;
        int deudores = 0;
        double porcentaje;
        for (int i = 0; i < pagos.length; i++) {
            System.out.print("Alumno " + (i + 1) + " pago? ");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("si")) {
                pagos[i] = true;
                pagosRealizados++;
            } else {
                pagos[i] = false;
                deudores++;
            }
        }
        porcentaje = (pagosRealizados * 100.0) / pagos.length;
        System.out.println("Cantidad de pagos: " + pagosRealizados);
        System.out.println("Cantidad de deudores: " + deudores);
        System.out.println("Porcentaje de cobranza: " + porcentaje + "%");
}
}
    
   
