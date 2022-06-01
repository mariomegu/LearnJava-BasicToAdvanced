import javax.swing.JOptionPane;

public class Ejercicio02B {
    public static void main (String [] args) throws Exception {
    
        /**
         * Números negativos o positivos hasta que se ingrese 0
         */
        
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));

        while ( numero != 0){
            if (numero > 0){
                JOptionPane.showMessageDialog(null, "El número " + numero + " es positivo");
            } else{
                JOptionPane.showMessageDialog(null, "El número " + numero + " es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }
    }
    
}
