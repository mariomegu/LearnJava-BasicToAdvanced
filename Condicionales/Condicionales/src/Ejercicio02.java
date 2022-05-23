import javax.swing.JOptionPane;

public class Ejercicio02 {
    public static void main (String[] args){
        int numero1, numero2;

        JOptionPane.showMessageDialog(null, "Queremos conocer que número es mayor o si son iguales \n Por favor ingrese dos números");

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));

        if (numero1 > numero2){
            JOptionPane.showMessageDialog(null, "El número " +numero1 + " es mayor que "+numero2);
        } if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null, "El numero " + numero2 + " es mayor que " + numero1);
        } else {
            JOptionPane.showMessageDialog(null, "Los número son iguales");
        }
    }
    
}
