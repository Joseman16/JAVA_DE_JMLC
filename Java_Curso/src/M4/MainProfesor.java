
package M4;

import static M4.Profesor.*;

public class MainProfesor {

    public static void main(String[] args) {
        Persona per = new Persona("0922712124","Juan Carlos", 39);
        Profesor prof = new Profesor(per, "Quimica",6);
        
        System.out.println(prof.toString());
        VerificarHorasAlDia(prof);
        VerificarHorasAlDia2(prof);
        
    }
    
}
