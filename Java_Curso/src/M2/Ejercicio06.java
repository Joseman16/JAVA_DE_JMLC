
package M2;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Persona
        String nombre = "";
        int edad = 0;
        double altura = 0.0;
        
        
        //Ingresar Datos
        System.out.println("Digite su nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Digite su edad: ");
        edad = entrada.nextInt();
        
        System.out.println("Digite su altura: ");
        altura = entrada.nextDouble();
        
        //Mostrar Datos
        System.out.println("Hola "+nombre);
        System.out.println(nombre+" tiene "+edad+" años ");
        System.out.println("Su altura es de "+altura);
        
    }
    
}
