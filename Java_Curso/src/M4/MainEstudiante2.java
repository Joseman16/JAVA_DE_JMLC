
package M4;

import java.util.Scanner;

public class MainEstudiante2 {


    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       boolean bandera = false;
       
       String cedula; 
       String nombre;
       int edad;
       
       Estudiante est; 
       
       String decision; 
       
       do{
           
           System.out.println("Digite su cedula: ");
           cedula = entrada.next();
           
           System.out.println("Digite su nombre: ");
           nombre = entrada.next();
            
           System.out.println("Digite su edad: ");
           edad = entrada.nextInt();
           
           est = new Estudiante(cedula, nombre, edad);
           est.IngresarDatos(est);
           
           
           System.out.println("\nDesea seguir ingresando datos[S/N]: "); 
           decision = entrada.next();
           
           if(decision.equals("s") || decision.equals("S")){
               bandera = true;
           }else{
               bandera = false;
           }
           
       }while(bandera);{
       
       est.MostrarDatosArreglo();
       
       } 
       
    }
    
}
