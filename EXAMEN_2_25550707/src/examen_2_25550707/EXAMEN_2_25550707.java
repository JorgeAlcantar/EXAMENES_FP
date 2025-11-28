

package examen_2_25550707;

import java.util.Scanner;


public class EXAMEN_2_25550707 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int eleccion;
        int primo;
        do{
        System.out.println("");
        System.out.println("***NÚMEROS PRIMOS Y NO PRIMOS***");
        System.out.print("INTRODUCE UN NÚMERO ENTERO: ");
        num = input.nextInt();
        System.out.println("¿CUÁL OPERACIÓN DESEA REALIZAR?");
        System.out.println("1. NÚMEROS NO PRIMOS.");
        System.out.println("2. NÚMEROS PRIMOS.");
        System.out.println("3. TERMINAR PROGRAMA.");
        eleccion = input.nextInt();
        switch(eleccion){
            case 1: 
                System.out.println("***NÚMEROS NO PRIMOS***");
                for(int i = 2; i <= num; i++){
                    boolean numPrimo = true;
                    for(int j = 2; j < i; j++){
                        primo = i % j;
                        if(primo == 0){
                            numPrimo = false;
                            break;
                        }
                    }
                        if(numPrimo == false){
                            System.out.print(i + "-");
                            for(int ind = 0; ind < i; ind++){
                                System.out.print("*");
                            }
                            System.out.println("");
                        }   
                    }
            break;
            case 2: 
                System.out.println("***NÚMEROS PRIMOS***");
                for(int i = 2; i <= num; i++){
                    boolean numPrimo1 = true;
                    for(int j = 2; j < i; j++){
                        primo = i % j;
                        if(primo == 0){
                            numPrimo1 = false;
                            break;
                        }
                    } 
                    if(numPrimo1 == true){
                        System.out.print(i + "-");
                        for(int indi = 0; indi < i; indi++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
            break;
        }
        }while(eleccion != 3);
    }
}
