
package M5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josman
 */
public class ListarEstudiante {
     private ArrayList<Estudiante> estudiantes = new ArrayList<>();
     
     
     public void IngresarEstudiante(Estudiante est){
        estudiantes.add(est);
    }
    
    
    public String mostrarDatos() {
    String datos = "";
    
    for (int i = 0; i < estudiantes.size(); i++) {
        datos += estudiantes.get(i).MostrarDatosEstudiante() + "\n";
    }
    
    return datos;
}

    
    public String mostrarDatos2 () {
        String datos = "";
        for (Estudiante est : estudiantes) {
            datos += est.MostrarDatosEstudiante() + "\n";
        }
        return datos;
    }
    
    public boolean NoRepetirCedula(Estudiante est){

        for(int i = 0; i<estudiantes.size(); i++){
            if(estudiantes.get(i).getCedula().equals(est.getCedula())){
                return true;
            }
        }
        return false;
    }
    
    
    public void agregarEstudiante(Estudiante est) {
        
        if(!NoRepetirCedula(est)){
            if (est.validarCedula() && est.validarNivel()) {
                estudiantes.add(est);
                JOptionPane.showMessageDialog(null, "Dato ingresado exitosamente",
                    "Ventana éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al ingresar datos, Cedula Repetida o nivel estan incorrecto",
                        "Ventana error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Error, CI repetida",
                        "Ventana error", JOptionPane.ERROR_MESSAGE);
        }
  
    }
      

}
