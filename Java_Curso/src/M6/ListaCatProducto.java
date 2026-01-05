
package M6;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaCatProducto {
    ArrayList<CatProducto> catProductos = new ArrayList<CatProducto>();
    
    public void AggCategoria(CatProducto ctgPro){
        catProductos.add(ctgPro);
    }
    
    public void mostrarCatProducto_enConsola(){
        for(CatProducto ctPro: catProductos){
            System.out.println(ctPro.toString());
        }
    }
    
    public String mostrarCatProducto1(){
        String datos = " ";
        for(int i = 0; i<catProductos.size();i++){
             datos+=catProductos.get(i).toString()+" \n";
        }
        
        return datos;
    }
    
    public boolean verificarID_Repetidas(CatProducto pro){
        for(int i = 0; i<catProductos.size(); i++){
           if(catProductos.get(i).getId() == pro.getId()){
               return true;
           }
        }
        return false;
    }
    
    
    public void registrarCategoria(CatProducto catPro){
        if(!verificarID_Repetidas(catPro)){
            AggCategoria(catPro);
        }else{
            JOptionPane.showMessageDialog(null, "Posible ID repetido", "Error",JOptionPane.WARNING_MESSAGE );
        }
    }

}
