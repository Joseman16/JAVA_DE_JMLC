
package M3;

import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ejercicio13 {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://cdn-icons-png.flaticon.com/512/3342/3342137.png");
        
        // Cargar imagen original
            ImageIcon iconoOriginal = new ImageIcon(url);

        // Redimensionar imagen (por ejemplo 80x80)
            Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);

        // Crear icono redimensionado
            ImageIcon iconoRedimensionado = new ImageIcon(imagenEscalada);
        
        JOptionPane.showMessageDialog(null, "Hola Mundo", "Ventana flotante", JOptionPane.INFORMATION_MESSAGE, iconoRedimensionado);
    }
    
}
