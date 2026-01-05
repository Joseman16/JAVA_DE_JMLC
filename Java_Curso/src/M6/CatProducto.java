
package M6;

import javax.swing.JOptionPane;

public class CatProducto {
    private int id;
    private String nombreCat;
    
    public CatProducto (){
        
    }
    
    public CatProducto(int id, String nombreCat){
        this.id = id;
        this.nombreCat = nombreCat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }

    @Override
    public String toString() {
        return "CatProducto{" + "id=" + id + ", nombreCat=" + nombreCat + '}';
    }
    
    
    public boolean validarID_NoCotener_Caracteres(String idCat){
        try{
            int id = Integer.parseInt(idCat);
            return id > 0;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                "Error! El ID debe ser numérico",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
    }
    
    
    
}
