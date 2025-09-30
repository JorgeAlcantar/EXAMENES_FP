

package pkg25550707_exa_eva1;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        //Programa para un atleta que compite en un triatlÓn, donde se captura los tiempos realizados en natación, ciclismo y carrera, esto con el fin de dar la clasificación en la que queda.
        //UTILIDAD DE SCANNER
        Scanner input = new Scanner(System.in);
       
        //INICIALIZACION DE VARIABLES: En este caso se utiliza double para permitir minutos con segundos.
        double tiemponata, tiempocicli, tiempocarrera, tiempototal;
       
        //IMPRIMIR
        System.out.print("INTRODUCE EL TIEMPO REALIZADO EN NATACION (MINUTOS): ");
        //INTRODUCCION DE DATOS
        tiemponata = input.nextDouble();
        
        //IMPRIMIR
        System.out.print("INTRODUCE EL TIEMPO REALIZADO EN CICLISMO (MINUTOS): ");
        //INTRODUCCION DE DATOS
        tiempocicli = input.nextDouble();
        
        //IMPRIMIR
        System.out.print("INTRODUCE EL TIEMPO REALIZADO EN CARRERA (MINUTOS): ");
        //INTRODUCCION DE DATOS
        tiempocarrera = input.nextDouble();
        
        //IMPRIMIR: ESTO IMPRIME EL TOTAL CAPTURADO DE LAS PRUEBAS
        tiempototal = tiemponata + tiempocicli + tiempocarrera;
        System.out.println("El tiempo total de las pruebas es: " + tiempototal + "minutos");

        //ESTRUCTURA DE DECISION (IF/ELSE) 
        if(tiempototal < 120 && tiemponata < 60 && tiempocicli < 60 && tiempocarrera < 60){
            System.out.println("Clasificación: Excelente");
       
        }else if(tiempototal < 150 || tiemponata < 70 || tiempocicli < 70 || tiempocarrera < 70){
            System.out.println("Clasificación: Buena");
        
        }else{
            System.out.println("Clasificación: Regular");
        }
        
    }
    
}
