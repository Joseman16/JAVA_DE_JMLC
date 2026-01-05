
package M6;

import org.w3c.dom.ls.LSInput;


public class Main {

    public static void main(String[] args) {
        
        ListaProducto listaProd = new ListaProducto();
        ListaCatProducto listaCatPro = new ListaCatProducto();

        
        CatProducto cat1 = new CatProducto(1,"Bebidas");
        CatProducto cat2 = new CatProducto(2,"Vegetales");
        CatProducto cat3 = new CatProducto(3,"Frutas");
        CatProducto cat4 = new CatProducto(4,"Embutidos");
        CatProducto cat5 = new CatProducto(5,"Lacteos");
        
        listaCatPro.AggCategoria(cat1);
        listaCatPro.AggCategoria(cat2);
        listaCatPro.AggCategoria(cat3);
        listaCatPro.AggCategoria(cat4);
        listaCatPro.AggCategoria(cat5);
       
        Producto pro1 = new Producto(1,"Coca Cola", cat1, 1.50);
        Producto pro2 = new Producto(2,"Tomate", cat2, 0.30);
        Producto pro3 = new Producto(3,"Leche", cat5, 1.10);
        Producto pro4 = new Producto(4,"Yogurt", cat5, 1.50);
        Producto pro5 = new Producto(5,"Chuzo Cuencano", cat4, 1.30);
        Producto pro6 = new Producto(6,"Manzanas",cat3, 0.25);

        listaProd.AgregarProducto(pro1);
        listaProd.AgregarProducto(pro2);
        listaProd.AgregarProducto(pro3);
        listaProd.AgregarProducto(pro4);
        listaProd.AgregarProducto(pro5);
        
        System.out.println("Lista de Categorias productos:");
        listaCatPro.mostrarCatProducto_enConsola();
        
        System.out.println("\nLista de productos:");
        listaProd.mostrarProducto_enConsola();
    }
    
}
