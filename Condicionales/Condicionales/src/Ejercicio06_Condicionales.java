import javax.swing.JOptionPane;

public class Ejercicio06_Condicionales {
    public static void main (String[] args) throws Exception{
        /**
         * Hacer un programa que tome dos números y diga si ambos son pares o impares
         * 
         */

         int numero1, numero2;

         numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
         numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));

         if((numero1 %2 == 0) && (numero2 %2 == 0)){
             JOptionPane.showMessageDialog(null, "ambos números son pares");
         } else if ((numero1 %2 == 0) && (numero2 %2 != 0)){
             JOptionPane.showMessageDialog(null, "Solo el primer número es par");
         } else if ((numero1 %2 != 0) && (numero2 %2 == 0)){
             JOptionPane.showMessageDialog(null, "Solo el segundo número es par");
         } else {
             JOptionPane.showMessageDialog(null, "Ambos números son Impares");
         }

    }
    
}
