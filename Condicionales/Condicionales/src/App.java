import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Codicional if

        /* 

        if(){

        }else{

        }

        */

        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número")) ;

        if (numero == dato){
            JOptionPane.showMessageDialog(null, "El número y el dato almacenado son iguales " + numero);
        } else{
            JOptionPane.showMessageDialog(null, "los números son diferentes");
        }
    }
}
