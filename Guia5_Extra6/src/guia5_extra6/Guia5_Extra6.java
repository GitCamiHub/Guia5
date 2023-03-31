/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
a medida que el usuario las va ingresando, construya una “sopa de letras para
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no
utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan 
las siguientes funciones de Java substring(), Length() y Math.random().*/
package guia5_extra6;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia5_Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        
        for (int i = 0; i < 5; i++) {     
             String retorno = leerPalabras(leer);
             ubicarPalabras(sopa,retorno,leer);
        }             
        llenarVacios(sopa);
        mostrarMatriz(sopa);
    }
    public static String leerPalabras(Scanner leer) {
        String palabra;
        do {
            System.out.println("Ingrese una palabra de 3 a 5 caracteres");
            palabra = leer.next();

        } while (palabra.length() > 5 || palabra.length() < 3);
        return palabra;

    }

    public static void ubicarPalabras(String[][] sopa, String palabra, Scanner leer) {
      int  columna=0;
       int fila=0;
     columna = (int) (Math.random() * (20 - palabra.length()));
      int i=0;
      fila = (int) (Math.random() * 20);
       
            for (int j = columna; j < columna+palabra.length(); j++) {
        
             sopa[fila][j] = palabra.substring(i,(i+1));
             i++;
            }
        
    }
    public static void llenarVacios(String[][]sopa){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(sopa[i][j]==null){
                int num = (int)(Math.random()*10);
                sopa[i][j] = String.valueOf(num);
            }
            }
            
        }
    }
    public static void mostrarMatriz(String[][]sopa){
         for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
               
                System.out.print(sopa[i][j]);
            }
             System.out.println(" ");
        }
    }
}
