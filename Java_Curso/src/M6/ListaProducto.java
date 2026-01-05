
package M6;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaProducto {
    ArrayList<Producto> productos = new ArrayList<Producto>();
    
    public void AgregarProducto(Producto pre){
        if(pre != null){
            productos.add(pre);
        }else{
            JOptionPane.showMessageDialog(null, "Datos nulos, vuelva a intentar", "Error",JOptionPane.WARNING_MESSAGE );
        }
        
    }
    
    public void mostrarProducto_enConsola(){
        for(Producto pro: productos){
            System.out.println(pro.toString());
        }        
    }
    
    public boolean verificarID_Repetidas(Producto pro){
        for(int i = 0; i<productos.size(); i++){
           if(productos.get(i).getId() == pro.getId()){
               return true;
           }
        }
        return false;
    }
    
    public void registrarProducto(){
        
    }
            

}
