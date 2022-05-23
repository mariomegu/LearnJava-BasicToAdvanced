import javax.swing.JOptionPane;

public class Ejercicio01 {

    public static void main (String[] args){

        //Hacer un programa que lea un numero entero y muestre si el numero es múltiplo de 10

        int numeroIngresado, residuo ;

        JOptionPane.showMessageDialog(null, "Este programa muestra si un número ingresado es multiplo de 10");

        numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Digita un número"));

        residuo = numeroIngresado%10;

        if (residuo == 0){
            JOptionPane.showMessageDialog(null, "El número "+numeroIngresado +   " es multiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "El número "+numeroIngresado +   " NO es multiplo de 10");
        }

    }
    
}
