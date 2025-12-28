
package M4;

public class Profesor extends Persona{
    private Persona per;
    private String materia;
    private int horasClases;

    public Profesor() {
    }

    public Profesor(Persona per, String materia, int horasClases) {
        this.per = per;
        this.materia = materia;
        this.horasClases = horasClases;
    }

    public Profesor(Persona per, String materia, int horasClases, String cedula, String nombre, int edad) {
        super(cedula, nombre, edad);
        this.per = per;
        this.materia = materia;
        this.horasClases = horasClases;
    }

    public Persona getPer() {
        return per;
    }

    public void setPer(Persona per) {
        this.per = per;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getHorasClases() {
        return horasClases;
    }

    public void setHorasClases(int horasClases) {
        this.horasClases = horasClases;
    }

    @Override
    public String toString() {
        return "Profesor{" + "per=" + per + ", materia=" + materia + ", horasClases=" + horasClases + '}';
    }
    
    public static void VerificarHorasAlDia(Profesor prof){
        if(prof.horasClases >=6){
            System.out.println("Esta las horas cumplidas");
        }else{
            System.out.println("Faltan Horas...");
        }
    }
    
    //Uso de gets
    public static void VerificarHorasAlDia2(Profesor prof){
        if(prof.getHorasClases() >=6){
            System.out.println("Esta las horas cumplidas");
        }else{
            System.out.println("Faltan Horas...");
        }
    }
    
    
}
