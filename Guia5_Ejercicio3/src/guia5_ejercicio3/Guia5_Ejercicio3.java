/*Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
package guia5_ejercicio3;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia5_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector.");
        int tamaño = leer.nextInt();
        int[] vector = new int[tamaño];
        
        llenarVector(vector, tamaño);
        contarNum(vector,tamaño);
    }
    public static void llenarVector(int[]vector, int tamaño){
        System.out.print("Vector = ");
        for (int i = 0; i < tamaño; i++) {
            vector[i] = (int)(Math.random()*15000);
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }
    public static void contarNum(int[]vector, int tamaño){
        int longitud;
        int num=0;
         int n1=0;
         int n2=0;
         int n3=0;
         int n4=0;
         int n5=0;
        for (int i = 0; i < tamaño; i++) {
          longitud=0;
            do{
                vector[i]= vector[i]/10;
                longitud += 1;
               
            }while (vector[i]!=0);
           
            switch (longitud) {
                case 1:
                    n1+=1;
                    break;
                case 2:
                    n2+=1;
                    break;
                case 3:
                    n3+=1;
                    break;
                 case 4:
                    n4+=1;
                    break;
                 case 5:
                    n5+=1;
                    break;
            }
           
        }
        System.out.println("Numeros de 1 cifra: " + n1);
        System.out.println("Numeros de 2 cifras: " + n2);
        System.out.println("Numeros de 3 cifras: " + n3);
        System.out.println("Numeros de 4 cifras: " + n4);
        System.out.println("Numeros de 5 cifras: " + n5);
    }
}
