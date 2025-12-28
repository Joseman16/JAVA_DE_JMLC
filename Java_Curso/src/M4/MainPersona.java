
package M4;

//import M4.Persona.*;
import static M4.Persona.*;


public class MainPersona {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona per = new Persona("0942677998","Jose",17);
        System.out.println(per.toString());
        VerificarEdad(per);
        VerificarCedula(per);
        
    }
    
}
