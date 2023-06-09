/*Realizar un programa que complete un vector con los N primeros números 
de la sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la
sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. 
Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una 
función que reciba como parámetro el valor de “n” y que calcule la serie
hasta llegar a ese valor. */
package guia5_extra7;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia5_Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese el termino de la sucesion de Fibonacci que quiere calcular.");
        int num = leer.nextInt();
        int [] serie= new int[num];
        calcularSerie(serie,num);
        mostrar(serie,num);
    }
    public static void calcularSerie(int [] serie,int num){
       
        for (int i = 0; i < num; i++) {
            if(i<=1){
                serie [i] = 1;
            }else if(i>1){
                 serie [i] = serie[i - 1] + serie[i-2];
            }
        }
        
    }
    public static void mostrar(int [] serie, int num){
        System.out.print("Fibonacci = ");
        for (int i = 0; i < num; i++) {
            System.out.print("["+serie[i]+"]");
        }
        System.out.println(" ");
    }
}
