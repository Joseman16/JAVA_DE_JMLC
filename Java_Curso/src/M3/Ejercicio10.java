
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
    
    public static double resta(double num1, double num2){
        
        double resultadoResta = num1 - num2;

        return resultadoResta;
    }
    
    public static double mult (double num1, double num2){
        
        double resultadoMult = num1 * num2;
        
        return resultadoMult;
    }
    
    public static double div (double num1, double num2){
        double resultadoDiv = 0;
        
        if(num1> num2){
            resultadoDiv = num1 / num2;
            
            return resultadoDiv;
        }else{
            resultadoDiv = num2 / num1;
            
            return resultadoDiv;
        }
    }
    
    public static double raizCuadrada (double num){
        double raizCuadrada;
        
        if(num>0){
            raizCuadrada = Math.sqrt(num);
            return raizCuadrada;
        }else{
            return raizCuadrada = 0;
        }
    }
    
    
}
