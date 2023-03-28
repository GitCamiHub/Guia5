/*Realizar un algoritmo que llene un vector de tamaño N con valores 
aleatorios y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido */
package guia5_ejercicio2;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia5_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector.");
        int tamaño = leer.nextInt();
        int vector[] = new int[tamaño];
        llenarVector(vector,tamaño);
        buscarNumero(vector, leer, tamaño);
    }
    public static void llenarVector(int[] vector, int tamaño){
        System.out.print("Vector = ");
        for (int i = 0; i < tamaño; i++) {
            vector[i] = (int) (Math.random()*20);
            System.out.print("["+vector[i]+"]");
        }
        System.out.println(" ");
    }
    public static void buscarNumero(int[] vector, Scanner leer, int tamaño) {
        System.out.println("Que numero quiere buscar en el vector?");
        int num = leer.nextInt();
        int posicion = 0;
        int contador = 0;
        for (int i = 0; i < tamaño; i++) {
            if (vector[i] == num) {
                posicion = i + 1;
                contador += 1;
                System.out.println("El numero " + num + " se encuentra en la posicion: " + posicion);
            }
        }
        if (contador == 0) {
            System.out.println("El numero " + num + " no se encuentra en el vector.");
        }
    }
}
