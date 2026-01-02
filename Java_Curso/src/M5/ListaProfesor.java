
package M5;

import M5.Profesor;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaProfesor {
    LinkedList<Profesor> profesores = new LinkedList<Profesor>();
    
    public void ingresarProfesor(Profesor prof){
        profesores.add(prof);
    }
    
    public String MostrarProfesor(){
       String datos =" ";
       
       for(int i = 0; i<profesores.size(); i++){
           datos += profesores.get(i).toString()+" \n";
       }
       return datos;
    }
    
    public String MostrarProfesor2(){
        String datos = "";
        for(Profesor prof: profesores){
            datos +=prof.toString();
        }
        return datos;
    }
    
    public boolean NoRepetirCedula(Profesor prof){
        boolean bandera = false;
        for(int i = 0; i<profesores.size(); i++){
            if(profesores.get(i).getCedula().equals(prof.getCedula())){
                bandera = true;
            }
        }
        //return false;
        return bandera;
    }
    
    
    public void RegistrarProfesor(Profesor prof){
        if(!NoRepetirCedula(prof )){
            if(prof.validarCedula()){
                ingresarProfesor(prof);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Error, CI ya existe!",
                    "Ventana de Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
