import javax.swing.JOptionPane;

public class Ejercicio05B {
    public static void main (String[] args) throws Exception{

        /**
         * Realizar un juego qpara adivinar un número. para ello generar 
         * un número aleatorio entre 0 -100, y luego ir pidiendo números, indicando si es
         *  mayo o menor con respecto a N. El proceso termina cuando el usuario acierta
         * Mostrar el número de intentos...
         */

         int numero, random, contador=1;


         numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número"));

         random = (int)(Math.random()*100);

         while (numero != random){
             if (numero > random) {
                 System.out.println("El número ingresado es mayor");
             } else{
                 System.out.println("El número ingresado es menor");
             }

             contador += 1;

             numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
         }

         System.out.println("Felicidades, adivinaste el número correcto en " + contador + " intentos");

    }
}