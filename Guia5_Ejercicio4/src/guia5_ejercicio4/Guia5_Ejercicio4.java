/*Realizar un programa que rellene una matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).*/
package guia5_ejercicio4;

/**
 *
 * @author BANGHO
 */
public class Guia5_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int [4][4];
        int[][] matrizT = new int [4][4];
        llenarMatriz(matriz);
        mostrarMatrizT(matriz, matrizT);
    }
    public static void llenarMatriz(int [][] matriz){
        System.out.println("Matriz =");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]= (int)(Math.random()*10);
                System.out.print("[" +matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
    }
    public static void mostrarMatrizT(int [][] matriz, int [][] matrizT){
        System.out.println("Matriz Transpuesta = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j] = matriz [j][i];
                System.out.print("[" +matrizT[i][j]+"]");
            }
            System.out.println(" ");
        }
    }
}