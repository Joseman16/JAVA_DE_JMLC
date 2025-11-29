
package M2;

import java.util.Scanner;


public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        /************* STRING *************/ 
        String nombre;
        
        System.out.println("Digite su nombre: ");
        nombre = entrada.nextLine();
        
        if(nombre.equals("Jose") || nombre.equals("jose")){
            System.out.println("Nombre correcto");
        }else{
            System.out.println("Nombre Incorrecto :(");
        }
        
        /************* INT *************/
        
        int num;
        
        System.out.println("Elige un valor de [1/50]: ");
        num = entrada.nextInt();
       
        if(num == 16 || num == 20){
            System.out.println("Esta dentro de mi numeros favoritos");
        }else{
            System.out.println("No es mi numero favorito");
        }
    }
    
}
