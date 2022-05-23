import javax.swing.JOptionPane;

public class Ternario {
    public static void main (String[] args){

        int numero;
        String mensaje;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número"));

        mensaje = (numero%2==0) ? "Es par" : "Es impar";

        JOptionPane.showMessageDialog(null, mensaje);

        /*
        Esta ejecución puede ser sustituida eliminando la variable mensaje y ejecutando el condicional ternario directamente en JOptionPane así:
        JOptionPane.showMessageDialog(null, (numero%2==0) ? "Es par" : "Es impar");

        */


    }
    
}
