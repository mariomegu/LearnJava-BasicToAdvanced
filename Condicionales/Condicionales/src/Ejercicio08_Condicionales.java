import javax.swing.JOptionPane;

public class Ejercicio08_Condicionales {

    public static void main (String[] args){
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número entre 0 y 99999"));

        if (numero < 10){
            JOptionPane.showMessageDialog(null, "El número tiene 1 digito");
        } 
        else if (numero < 100){
            JOptionPane.showMessageDialog(null, "El número tiene 2 digitos");
        }
        else if (numero < 1000){
            JOptionPane.showMessageDialog(null, "El número tiene 3 digitos");
        }
        else if (numero < 10000){
            JOptionPane.showMessageDialog(null, "El número tiene 4 digitos");
        } else {
            JOptionPane.showMessageDialog(null, "El número tiene 5 digitos o más");
        }
    }
    
}
