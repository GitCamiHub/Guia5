/*Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia
traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
sus filas por columnas (o viceversa).*/
package guia5_ejercicio5;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia5_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz cuadrada.");
        int tamaño = leer.nextInt();
        int[][] matriz = new int[tamaño][tamaño];
        int[][] matrizT = new int[tamaño][tamaño];
        
        llenarMatriz(matriz, tamaño, leer);
        mostrarMatriz(matriz,tamaño);
        matrizTranspuesta(matrizT,matriz,tamaño);
        boolean antisimetrica = matrizAntisimetrica(matrizT,matriz,tamaño);
        System.out.println("Es antisimetrica? " + antisimetrica);
        
    } 
    public static void llenarMatriz(int[][] matriz, int tamaño, Scanner leer) {
        System.out.println("Matriz =");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.println("Ingrese la posicion [" + i + "] [" + j + "]");
                int posicion = leer.nextInt();
                matriz[i][j]=posicion;
            }

        }
    }
    public static void matrizTranspuesta(int[][] matrizT, int[][]matriz, int tamaño){
        System.out.println("Matriz Transpuesta =");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matrizT[i][j] = matriz[j][i];
                 System.out.print("[" +matrizT[i][j]+"]");
            }  
            System.out.println(" ");
        }
    }
        public static void mostrarMatriz(int[][]matriz, int tamaño){
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    System.out.print("[" +matriz[i][j]+"]");
                }
                System.out.println("");
            }
        
            }
        public static boolean matrizAntisimetrica(int[][] matrizT, int[][]matriz, int tamaño){
           
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    
                    if (i == j && (matrizT[i][j] != 0)) {
                        return false;
                    }
                    if(matrizT[i][j]!=(-1*(matriz[i][j]))){
                        return false;
                    }
            }
        }
        return true;
          
           
        }
    }

