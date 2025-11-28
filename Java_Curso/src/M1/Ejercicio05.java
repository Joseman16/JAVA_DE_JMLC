
package M1;


public class Ejercicio05 {


    public static void main(String[] args) {
        int num = 10;
        double numDecimal = 19.223;
        
        /*  El método Math.pow(base, exponente) 
            que eleva un número (la base) 
            a la potencia de otro número (el exponente). 
        */
        System.out.println("\nPotencia, pow(base, exponente)");
        System.out.println(Math.pow(num, 3));
        System.out.println(Math.pow(numDecimal, 2));
        System.out.println(Math.pow(3, 3));
        
        
        //También tiene constantes estáticas como:
        //E: el número de Euler (2.718281828459045)
        //PI: el número pi (3.141592653589793)
        // Math.TAU, que equivale a aproximadamente "6.283185307179586" y es el doble del valor de PI, (2*pi).
        System.out.println("\nConstantes estáticas");
        System.out.println("Euler: "+Math.E);
        System.out.println("PI: "+Math.PI);
        System.out.println("TAU: "+Math.TAU);
    }
    
}
