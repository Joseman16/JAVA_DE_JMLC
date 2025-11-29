
package M3;

import javax.swing.JOptionPane;


public class Ejercicio12 {

    
    public static void main(String[] args) {
        int num = 16;
        String palabra = "Ahh Bueno!";
        double altura = 1.81;
        
        //Null: porque no depende de ninguna ventana aparte...
        JOptionPane.showMessageDialog(null, "Numero favorito: "+num, "Ventana 1: INT", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Palabra que mas uso: "+ palabra , "Ventana 2: STRING", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Altura: "+altura, "Ventana 2: DOUBLE", JOptionPane.INFORMATION_MESSAGE);
                 
        /*
        Usar:
            PLAIN_MESSAGE
            OK_OPTION
            DEFAULT_OPTION
            WARNING_MESSAGE
            YES_OPTION
            QUESTION_MESSAGE          
        */
    }
    
}
