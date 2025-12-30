
package M4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MainEstudiante {

    
    public static void main(String[] args) {
        
        Estudiante est = new Estudiante("0942677998","Josema",16);
        System.out.println(est.toString());
        est.MostrarDatos();
        est.MostrarDatos2();
        
        Estudiante est1 = new Estudiante("1792392323","Jennifer",16);
        Estudiante est2 = new Estudiante("1283838390","Sara",17);
        Estudiante est3 = new Estudiante("0942424322","Jhon",17);
        Estudiante est4 = new Estudiante("0942672123","Randy",15);
        
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        estudiantes.add(est1);
        estudiantes.add(est2);
        estudiantes.add(est3);
        estudiantes.add(est4);
        
        System.out.println("\nUso de For tradicional");
        //Mostrar los datos...
        for(int i =0; i< estudiantes.size(); i++){
            System.out.println(estudiantes.get(i));
        }
        
        //Muestra al primero de la lista...
        System.out.println("\nPrimero en la lista: "+estudiantes.getFirst());
        
        //Muestra al ultimo de la lista...
        System.out.println("Ultimo en la lista: "+estudiantes.getLast());
        
        
        System.out.println("\nUsando Iterator");
        //Itera y muestra todos los datos, sin necesidad de los ciclos...
        Iterator<Estudiante> it = estudiantes.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        //Más sencillo, usar for-each
        System.out.println("\nFor Each");
        for (Estudiante estudiante : estudiantes){
            System.out.println(estudiante);
        }
        
        //Ingresar otros Estudiante:
        Estudiante est5 = new Estudiante("1792392323","Elias",15);
        Estudiante est6 = new Estudiante("1283838390","Milena",18);
        Estudiante est7 = new Estudiante("0942424322","Dereck",13);
        Estudiante est8 = new Estudiante("0942672123","Gabriela",12);
        
        LinkedList<Estudiante> estudiantes2 = new LinkedList<Estudiante>();
        estudiantes2.add(est5);
        estudiantes2.add(est6);
        estudiantes2.add(est7);
        estudiantes2.add(est8);
        
        System.out.println("\nNueva Lista de Estudiantes");
        System.out.println("foreach");
        for(Estudiante estudiante: estudiantes2){
            System.out.println(estudiante);
        }
        
        System.out.println("\nfor");
        for(int i= 0; i<estudiantes2.size(); i++){
            System.out.println(estudiantes2.get(i));
        }
    }
    
}
