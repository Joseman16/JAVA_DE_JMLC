
package M4;


public class Persona {
    private String cedula;
    private String nombre;
    private int edad; 
    
    public Persona(){
        
    }
    
    public Persona(String cedula, String nombre, int edad) {
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
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
     //Tambien se puede ayudar con los gets
    public static void VerificarEdad(Persona per){
        if(per.edad >=18 ){
            System.out.println(per.nombre + " es mayor de edad");
        }else{
            System.out.println(per.nombre + " es menor de edad");
        }
    }
    
   
    public static void VerificarCedula(Persona per){
        if(per.cedula.length() == 10){
            System.out.println("Es correco su numero de cedula ");
        }else{
            System.out.println("Es incorrecto su numero de cedula");
        }
    }
}
