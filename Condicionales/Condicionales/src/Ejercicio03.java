import javax.swing.JOptionPane;

public class Ejercicio03 {
    public static void main (String[] args) throws Exception {
        //Programa que lea un carácter por teclado y compruebe si es una letra mayúscula

        char letra;

        letra = JOptionPane.showInputDialog("Por favor digita una letra ").charAt(0);

        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "La letra es mayúscula");
        } else{
            JOptionPane.showMessageDialog(null, "La letra es minúscula");
        }
    }
    
}
