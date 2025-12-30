
package M4;

import java.util.ArrayList;

public class Estudiante {
    private String cedula;
    private String nombre;
    private int edad;
    
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    
    public Estudiante(){
        
    }
    public Estudiante(String cedula, String nombre, int edad){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
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

    @Override
    public String toString() {
        return "Estudiante{" + "cedula=" + cedula + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    public void MostrarDatos(){
        System.out.println("Estudiante "+getNombre()+", numero de ceula: "+getCedula()+", edad: "+getEdad());
    }
    public void MostrarDatos2(){
        System.out.println("Estudiante "+nombre+", numero de ceula: "+cedula+", edad: "+edad);
    }
    
    public void IngresarDatos(Estudiante est){
        estudiantes.add(est);
    }
    
    public void MostrarDatosArreglo(){
        for(int i = 0; i<estudiantes.size();i ++){
            System.out.println(estudiantes.get(i));
        }
    }
    
}
