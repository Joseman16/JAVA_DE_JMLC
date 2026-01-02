
package M5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Estudiante {
    private String cedula;
    private String nombre;
    private int edad;
    private int nivel;
    
    
    public Estudiante(){
        
    }
    
    public Estudiante(String cedula, String nombre, int edad, int nivel ){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.nivel = nivel;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public String MostrarDatosEstudiante(){
        return "CI: "+getCedula()+", nombre: "+getNombre()+" tiene "+getEdad()+" años de edad, "+"pertenece al curso: "+getNivel();
    }
    
    /*public boolean validarCedula(){
        if(cedula.length() == 10){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean validarNivel(){
        if(nivel>0 && nivel<=6){
            return true;
        }else{
            return false;
        }
    }*/
    
    public boolean validarCedula() {
        return cedula != null && cedula.length() == 10;
        
    }

    public boolean validarNivel() {
        return nivel > 0 && nivel <= 6;
    } 
        
}
