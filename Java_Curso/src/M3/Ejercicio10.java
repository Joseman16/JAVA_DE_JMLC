
package M3;


public class Ejercicio10 {

    public static void main(String[] args) {
        
        //Mostrar directo
        System.out.println("La suma es: "+suma(16, 4));
        
        //Guardar en una varibale
        double sumaTotal = suma(14, 14);
        System.out.println("La suma es: "+sumaTotal);
        
        /*
            resta
            mult
            div
            raiz cuadrada
        */
        
    }
    
    public static double suma( double num1, double  num2){
        
        double resultadoSuma = num1 + num2;
        
        return resultadoSuma; 
    }
    
    
}
