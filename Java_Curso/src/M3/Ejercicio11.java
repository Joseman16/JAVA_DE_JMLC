
package M3;


public class Ejercicio11 {

   
    public static void main(String[] args) {
        
        mult(22, 2);
        div(10,90);
        
        /*
            suma
            resta           
            div
            Potencia
        */
        
        
    }
    
    public static void mult(double num1, double num2 ){   
        double resultadoMult = num1 * num2; 
        System.out.println("Resultado de la multiplicación: "+resultadoMult);
    }
    
    public static void div(double num1, double num2){
        double resultadodiv = 0;
        //Aqui yo le indico que el numero mayor sea el numerador...
        //Y el menor sea el denominador...
        if(num1>num2){
            resultadodiv = num1 / num2;
            System.out.println("Resultado de la División es: "+resultadodiv);
        }else{
            resultadodiv = num2 /num1;
            System.out.println("Resultado de la División es: "+resultadodiv);
        }
    }
    
}
