/*Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia
entre los elementos).*/
package guia5_extra2;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia5_Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores.");
        int tamaño = leer.nextInt();
        int[] vector1 = new int[tamaño];
        int[] vector2 = new int[tamaño];
        llenarVectores(vector1,vector2,tamaño,leer);
        mostrarVectores(vector1,vector2,tamaño);
        boolean retorno = sonIguales(vector1,vector2,tamaño);
        System.out.println("Los vectores son iguales? " + retorno);
    }
    public static void llenarVectores(int[] vector1 , int [] vector2,int tamaño, Scanner leer){
        int elementos, elementos2;
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese " + tamaño + " elementos para el vector 1.");
            elementos = leer.nextInt();
            vector1[i] = elementos;
        }
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ahora ingrese los " + tamaño + " elementos para el vector 2.");
            elementos2 = leer.nextInt();
            vector2 [i]= elementos2;
        }
    }

    public static void mostrarVectores(int[] vector1, int[] vector2, int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            System.out.print("[" + vector1[i] + "]");
        }
        System.out.println("");
        for (int i = 0; i < tamaño; i++) {

            System.out.print("[" + vector2[i] + "]");
        }
        System.out.println("");
    }
    public static boolean sonIguales(int[] vector1, int[] vector2, int tamaño){
        for (int i = 0; i < tamaño; i++) {
            if (vector1[i]!= vector2[i]){
                return false;
            }
        }
        return true;
    }
}
