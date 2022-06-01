import javax.swing.JOptionPane;

public class Ejercicio03B { 
    public static void main (String[] args) throws Exception{

        /**
         * Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar
         */

         int numero, mod;
         numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));

         while (numero != 0){
             mod = numero %2;
             if ((numero %2) == 0){
                 System.out.println("El número " + numero + " es par");
             } else{
                 System.out.println("El número " + numero + " es impar");
             }
             numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro núnero"));
         }
    }
    
}
