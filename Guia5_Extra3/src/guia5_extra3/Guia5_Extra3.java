/*Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o procedimiento
que imprima el vector.*/
package guia5_extra3;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia5_Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector.");
        int tamaño = leer.nextInt();
        int[] vector = new int[tamaño];
        
        llenarVector(vector,tamaño);
        imprimirVector(vector,tamaño);
    }
    public static void llenarVector(int[]vector,int tamaño){
        for (int i = 0; i < tamaño; i++) {
            vector[i]= (int)(Math.random()*100);
        }
    }
    public static void imprimirVector(int[]vector,int tamaño){
        System.out.print("Vector aleatorio = ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println(" ");
    }
}
