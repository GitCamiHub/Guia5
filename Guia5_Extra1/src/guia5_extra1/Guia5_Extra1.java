/*Realizar un algoritmo que calcule la suma de todos los elementos
de un vector de tamaño N, con los valores ingresados por el usuario.*/
package guia5_extra1;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia5_Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector.");
        int tamaño = leer.nextInt();
        int [] vector = new int[tamaño];
        int retorno = sumar(vector,tamaño,leer);
        mostrarVector(vector,tamaño);
        System.out.println("La suma de los elementos del vector es: " + retorno);
    }
    public static int sumar(int [] vector, int tamaño, Scanner leer){
        int relleno;
        int suma=0;
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese un numero para agregar al vector.");
            relleno = leer.nextInt();
            vector[i]=relleno;
            suma+=relleno;
        }
        return suma;
    }
    public static void mostrarVector(int[]vector,int tamaño){
        System.out.print("Vector = ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }
}
