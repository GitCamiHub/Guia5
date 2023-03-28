/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
Crear un programa que permita introducir un cuadrado por teclado y determine
si este cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.*/
package guia5_ejercicio6;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia5_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);   
       int [][] matriz = new int [3][3];
       
       llenarMatriz(matriz,leer);
       boolean magica = evaluarMagia(matriz);
        System.out.println("Esta matriz es magica? "+magica);
    }
    public static void llenarMatriz(int[][] matriz, Scanner leer) {
        int posicion;
        System.out.println("Llene una matriz de 3x3 con numeros del 1 al 9.");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Posicion " + i + ", " + j + ": ");
                    posicion = leer.nextInt();
                    matriz[i][j] = posicion;
                } while (posicion > 9 || posicion < 1);
          }
          
        }
}
    public static boolean evaluarMagia(int[][] matriz){
        int fila0=0, fila1=0, fila2=0;
        int columna0=0, columna1=0, columna2=0;
        int diagonalP=0;
        int diagonalS=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    diagonalP += matriz[i][j];}
                if (i + j == 2) {
                    diagonalS += matriz[i][j];}
               
             fila0 += matriz[0][j];
             fila1 += matriz[1][j];
             fila2 += matriz[2][j];
             columna0 += matriz[i][0];
             columna1 += matriz[i][1];
             columna2 += matriz[i][2];
                              
                }
        }
         if (fila0 != fila1) {
                return false;
            } else if (fila1!= fila2){
                return false;
            }else if (fila2!=columna0){
                return false;
            }else if (columna0!=columna1){
                return false;
            }else if (columna1!=columna2){
                return false;
            }
        if (diagonalP != diagonalS) {
            return false;
        }
        return true;
}
}
