
package M5;

import javax.swing.JOptionPane;

public class Profesor {
    private String cedula;
    private String nombre;
    private int edad;
    private String materia;
    
    public Profesor(){
        
    }
    
    public Profesor(String cedula, String nombre, int edad, String materia){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.materia = materia;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Profesor{" + "cedula=" + cedula + ", nombre=" + nombre + ", edad=" + edad + ", materia=" + materia + '}';
    }
    
    public boolean validarCedula(){
        if(cedula != null && cedula.length()==10){
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "CI debe tener 10 digitos!",
                    "Ventana de Error", JOptionPane.ERROR_MESSAGE);
            
            return false;
        }
    }
     
    
}
