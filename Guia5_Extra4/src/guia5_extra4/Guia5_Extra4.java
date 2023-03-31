/*Los profesores del curso de programación de Egg necesitan llevar un registro
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el período de cursado cada alumno obtiene
4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la 
cantidad de aprobados y desaprobados, teniendo en cuenta que solo
aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.*/
package guia5_extra4;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia5_Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] vector = new double[10];
        llenarVector(vector, leer);
        aprobados(vector);
    }
    public static void llenarVector(double[]vector,Scanner leer){
        double n1,n2,n3,n4, promedio;
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Alumno "+ (i+1)+".");
            System.out.println("Primer trabajo práctico evaluativo:");
            n1 = nota(leer);
            System.out.println("Segundo trabajo práctico evaluativo:");
            n2 = nota(leer);
            System.out.println("Primer integrador:");
            n3 = nota(leer);
            System.out.println("Segundo integrador:");
            n4 = nota(leer);
            promedio = (n1*0.1)+(n2*0.15)+(n3*0.25)+(n4*0.5);
            vector[i]= promedio;
            promedio=0;
        }
    }
    public static int nota(Scanner leer){
        int nota;        
        do {       
            nota = leer.nextInt();   
            System.out.println("La nota debe estar entre 0 y 10");
           //nota = (int)(Math.random()*10);         
        } while (nota<0 || nota >10); 
        return nota;
    }
    public static void aprobados(double[]vector){
        int aprobados =0;
        int desaprobados=0;
        for (int i = 0; i < 10; i++) {
            if(vector[i]>=7){
                aprobados +=1;
            }else{
                desaprobados +=1;
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);
        
    }
}
