
package M6;

import javax.swing.JOptionPane;


public class Producto {
    private int id;
    private String nombre;
    private CatProducto categoria;
    private double precio;
    
    public Producto(){
        
    }

    public Producto(int id, String nombre, CatProducto categoria, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CatProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CatProducto categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + '}';
    }
    
    
    public boolean validarCastegoria(Producto pro){
        if(pro.getCategoria()!= null){
            return true;
        }
        return false;
    }
    
    /*public boolean validarValorPrecio(Producto pro){
        double valorPro = 0;
        try{
            valorPro = pro.getPrecio();
            return true;
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error!, precio no es un valor valido","Error",JOptionPane.ERROR);
            return false;
            
        }
    }*/
    
    public boolean validarPrecioDesdeTexto(String precioTexto){
        try{
            double precio = Double.parseDouble(precioTexto);
            return precio > 0;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                "Error! El precio debe ser numérico",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
    }

}
