
package M3;

import java.util.Scanner;

public class Ejercicio14 {

    
    public static void main(String[] args) {
        //Ciclo While
        
        Scanner entrada = new Scanner(System.in);
        
        int contador = 0;
        while (contador <20){
            
            contador =  contador + 1;
            System.out.println("seg "+contador);
        }
        
        
        //Ciclo do - while
        int edad = 0;
        do{
            System.out.println("\n");
            System.out.print("Digite su edad: ");
            edad = entrada.nextInt();
            System.out.println("\n No puede Ingresar");
                    
        }while(edad < 18);{
            System.out.println("Puede Ingresar");
        }
        
        
        //Ciclo for
        System.out.println("\nCiclo FOR");
        for(int i = 0; i<=20; i++){
            System.out.println("numero "+i);
        }
    }
    
}
