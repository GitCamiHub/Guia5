/*Realizar un programa que llene una matriz de tamaño NxM con valores 
aleatorios y muestre la suma de sus elementos.*/
package guia5_extra5;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia5_Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de columnas de la matriz.");
        int columnas = leer.nextInt();
        System.out.println("Ingrese la cantidad de filas de la matriz.");
        int filas = leer.nextInt();
        int[][] matriz = new int[filas][columnas];
        
        llenarMatriz(matriz,filas,columnas);
        mostrarMatriz(matriz,filas,columnas);
    }
    public static void llenarMatriz(int[][]matriz, int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int)(Math.random()*10);
            }
            
        }
    }
    public static void mostrarMatriz(int[][]matriz, int filas, int columnas){
        int sumatoria=0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("["+matriz[i][j]+"]");
                sumatoria+=matriz[i][j];
            }
            System.out.println(" ");
        }
        System.out.println("La sumatoria de todos los elementos de la matriz es: "+sumatoria);
    }
    
}
