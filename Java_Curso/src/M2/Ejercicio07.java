
package M2;

import java.util.Scanner;


public class Ejercicio07 {

   
    public static void main(String[] args) {
        //if - else
        
        String nombre;
        int edad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite su nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Digite su edad: ");
        edad = entrada.nextInt();
                
        System.out.println("\nUso de Equals");
        if(nombre.equals("Jose")){
            System.out.println("Nombre Correcto");
        }else{
            System.out.println("Nombre Incorrecto");
        }
        
        if(edad == 22){
            System.out.println("Edad Correcta");
        }else{
            System.out.println("Edad Incorrecta");
        }
        
    }
    
}
