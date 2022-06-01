import javax.swing.JOptionPane;

public class Ejercicio04B {
    public static void  main (String[] args) throws Exception{
        /** 
         *  Pedir números hasta se teclee uno negativo, y mostrar cuantos numeros se han introducido
        */

        int numero, conta = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));

        while (numero >= 0){

            conta += 1;

            System.out.println("Se han introducido " + conta + " Números positivos");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }
    }
    
}
