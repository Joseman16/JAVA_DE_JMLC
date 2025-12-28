
package M3;

import java.util.Scanner;


public class Ejercicio15 {

    
    public static void main(String[] args) {
        TablaMultiplcar(2);
        ValidarPasswor();
        TablaMultiplicar2(5);
        
    }
    
    
    
    
    public static void TablaMultiplcar(int num){
        for(int i = 0; i<=20; i++){
            System.out.println(i+" * "+num+" = "+num*i);
        }
    }
    
    public static void ValidarPasswor (){
        
        Scanner entrada = new Scanner (System.in);
        boolean bandera;
        String password = "";
        
        do{
            System.out.print("Digite la contraseña correcta: ");
            password = entrada.nextLine();          
            if(password.equals("cofito123")){
                bandera = false;
            }else{
                bandera = true ;
            }        
        }while(bandera);{
            System.out.println("Contraseña Correcta"); 
        }
    }
    
    public static void TablaMultiplicar2(int num ){
        int i = 0;
        while(i < 20){
            i = i + 1;
            System.out.println(i +" * "+num+" = "+i*num);
        }
    }
    
    
    
}
