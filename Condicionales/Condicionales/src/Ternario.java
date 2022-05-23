import javax.swing.JOptionPane;

public class Ternario {
    public static void main (String[] args){

        int numero;
        String mensaje;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número"));

        mensaje = (numero%2==0) ? "Es par" : "Es impar";

        JOptionPane.showMessageDialog(null, mensaje);


    }
    
}
