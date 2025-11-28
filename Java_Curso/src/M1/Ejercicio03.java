
package M1;

import static java.lang.Math.*;


public class Ejercicio03 {

    public static void main(String[] args) {
        //Funciones o metodos de la ibreria math...
        
        int num = 11;
        double numDecimal = 22.12;
        
        //abs(x): Devuelve el valor absoluto de x 
        System.out.println("\nabs(x)");
        System.out.println(abs(num));
        System.out.println(abs(91));
        
        //ceil(x): Devuelve el entero más pequeño que es mayor o igual a x
        System.out.println("\nceil(x)");
        System.out.println(ceil(num));
        System.out.println(ceil(101.3));
        
        //floor(x): Devuelve el entero más grande que es menor o igual a x
        System.out.println("\nfloor");
        System.out.println(floor(num));
        System.out.println(floor(101.3));
        
        //max(x , y): Devuelve el mayor de X e Y
        System.out.println("\nmax(x,y)");
        System.out.println(max(num, numDecimal));
        System.out.println(max(33, 30));
        
        //min(x , y): Devuelve el menor de X e Y
        System.out.println("\nmin(x,y)");
        System.out.println(min(num, numDecimal));
        System.out.println(min(33, 30));
        
            
        /*  Limitar decimales en un decimal (double)
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println(df.format(number));
        */
        
        //random(): devuelve un número aleatorio entre 0 y 1
        System.out.println("\nrandom()");
        System.out.println(random());
        System.out.println((random()*10));
        
        //round(x): Devuelve el entero más cercano a x.
        System.out.println("\nround(x)");
        System.out.println(round(num));
        System.out.println(round(numDecimal));
        System.out.println(round(9.78));
        
    }
    
}
