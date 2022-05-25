import javax.swing.JOptionPane;

public class Ejercicio07_Condicionales {
    public static void main (String[] args) throws Exception{
        /**
         * Pedir tres números y mostrarlos ordenados de mayor a menor
         */

         int numero1, numero2, numero3;

         numero1= Integer.parseInt(JOptionPane.showInputDialog("Digite un el primer número"));
         numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));
         numero3= Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer número"));

         if (numero1> numero2 && numero2 > numero3){
             JOptionPane.showMessageDialog(null, "El orden correcto de mayor a menor es: " +numero1 + numero2 +numero3);
         } else if (numero1 > numero2 && numero3 > numero2){
            JOptionPane.showMessageDialog(null, "El orden correcto de mayor a menor es: " +numero1 + numero3 + numero2);
         } else if (numero2 > numero1 && numero1 > numero3){
             JOptionPane.showMessageDialog(null, "El orden correcto de mayor a menor es: "+numero2 + numero1 + numero3);
         } else if (numero2 > numero1 && numero3 > numero1){
             JOptionPane.showMessageDialog(null, "El orden correcto de mayor a menor es: "+numero2 + numero3 + numero1);
         }else if (numero3 > numero1 && numero1 > numero3);



    }
    
}
