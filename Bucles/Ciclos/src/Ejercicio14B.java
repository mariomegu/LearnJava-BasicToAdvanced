import javax.swing.JOptionPane;

public class Ejercicio14B {
    public static void main(String[] args) throws Exception{
        /**
         * Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores a $1000
         */

         float sueldo, suma=0;
         int contSueldoMayor = 0;

         for (int i=1; i<=10; i++){

            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digita el sueldo "+ i));

            suma += sueldo;

            if (sueldo > 1000){
                contSueldoMayor +=1;
            }

         }

         System.out.println("\nLa suma del sueldo es " + suma);
         System.out.println("\nLa cantidad de sueldos mayores a 1000 son "+ contSueldoMayor);

    }
    
}
