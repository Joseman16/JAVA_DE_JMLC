
package M1;

import java.text.DecimalFormat;


public class Ejercicio04 {


    public static void main(String[] args) {
        int numEntero = 10;
        double numeroDecimal = 82.33;
        
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        //sqrt(x): Devuelve la raíz cuadrada de x.
        System.out.println("\n-sqrt(x)");
        System.out.println(Math.sqrt(numEntero));
        System.out.println(Math.sqrt(numeroDecimal));
        
        //cbrt(x): Devuelve la raíz cubica de x.
        System.out.println("\n-cbrt(x)");
        System.out.println(Math.cbrt(numEntero));
        System.out.println(Math.cbrt(numeroDecimal));
        
        //Usando El formato decimal
        System.out.println("\n-Usando el DF (DecimalDormat) en SQRT");
        System.out.println(df.format(Math.sqrt(numeroDecimal)));
        System.out.println(df.format(Math.sqrt(numEntero)));
        
        
        System.out.println("\n-Usando el DF (DecimalDormat) en CBRT");
        System.out.println(df.format(Math.cbrt(numeroDecimal)));
        System.out.println(df.format(Math.cbrt(numEntero)));
        
        //Guardando en una variable
        double resultadoSQRT = Math.sqrt(numeroDecimal);
        double resultadoCBRT = Math.cbrt(numeroDecimal);
        
        System.out.println("\n-Mostrando datos que se gurado en las variables");
        System.out.println(resultadoCBRT);
        System.out.println(resultadoSQRT);
    }
    
}
