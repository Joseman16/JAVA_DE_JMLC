
package M2;

import java.util.Scanner;


public class Ejercicio09 {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /********* NÚMEROS ROMANOS *********/ 
        int numero;
        
        System.out.println("Digite un valor: ");
        numero = entrada.nextInt();
        
        switch(numero){
            case 1: System.out.println("I"); 
                break;
            case 2: System.out.println("II");
                break;
            case 4: System.out.println("III");
                break;
            case 5: System.out.println("IV");
                break;
            case 6: System.out.println("V");
                break;
            case 7: System.out.println("VI");
                break;
            case 8: System.out.println("VII");
                break;
            case 9: System.out.println("IX");
                break;
            case 10: System.out.println("X");
                break;
            default: System.out.println("No existe dicho valor aqui!");
                break;
        
        }
        
    }
    
}
