
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
    
    /*public void registrarProducto(Producto pro){
        if(!verificarID_Repetidas(pro)){
            if(!pro.validarCastegoria(pro)){
                JOptionPane.showMessageDialog(null, "Registrado Correctamente", "Exito",JOptionPane.INFORMATION_MESSAGE);
                AgregarProducto(pro);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Error, ID repetida", "Error",JOptionPane.ERROR);
        }
    }*/
    
    
    public void registrarProducto(Producto pro){
        if(verificarID_Repetidas(pro)){
            JOptionPane.showMessageDialog(null,
                "Error, ID repetida",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(!pro.validarCategoria()){
            JOptionPane.showMessageDialog(null,
                "Error, categoría inválida",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        AgregarProducto(pro);
        JOptionPane.showMessageDialog(null,
            "Producto registrado correctamente",
            "Éxito",
            JOptionPane.INFORMATION_MESSAGE);
    }

            

}
