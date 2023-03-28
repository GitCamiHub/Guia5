/*Realizar un algoritmo que llene un vector con los 100 primeros
números enteros y los muestre por pantalla en orden descendente.*/

package guia5_ejercicio1;

/**
 *
 * @author BANGHO
 */
public class Guia5_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        System.out.print("Vector = ");
        for (int i = 99; i>= 0; i--) {
            vector[i]= i+1;
            System.out.print("["+vector[i]+"]");
        }
    }
    
}
