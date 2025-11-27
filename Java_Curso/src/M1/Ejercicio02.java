
package M1;

public class Ejercicio02 {
    
    public static void main(String[] args) {
    // Operaciones aritmeticas 
        //Enteros (int o long)
        int num1 = 20;
        int num2 = 8;
        
        System.out.println("******* NUM ENTEROS ********");
        System.out.println("Suma: "+(num1 + num2));
        System.out.println("Resta: "+ (num1 - num2));
        System.out.println("Mult: "+(num1 * num2));
        System.out.println("Div: "+num1 / num2);
        
        //Decimales (float o double)
        double num1D = 59.99;
        double num2D = 12.9;
        
        System.out.println("\n******* NUM DECIMALES ********");
        System.out.println("Suma: "+(num1D + num2D));
        System.out.println("Resta: "+ (num1D - num2D));
        System.out.println("Mult: "+(num1D * num2D));
        System.out.println("Div: "+num1D / num2D);
        
        
        //Variables donde guardar el resultado de las variables
        int suma = num1 + num2;
        int resta = num1 - num2;
        int mult = num1 * num2;
        double div = num1 /num2;
        
        System.out.println("\n******* OPERACIONES UTILIZANDO UNA VARIABLE DONDE GUARDAR RSULTADO ********");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Mult: " + mult);
        System.out.println("Div: "+ div);
    }
    
}
