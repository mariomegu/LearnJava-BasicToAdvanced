import javax.swing.JOptionPane;

public class Ejercicio10_Condicionales {
    public static void main (String[] args){
        /**
         * Padir el día, mes y año e indicar si la fecha es correcta. Con meses de 28, 30 y 31. Sin años bisiestos
         */

         int dia, mes, año;

         dia = Integer.parseInt(JOptionPane.showInputDialog("Digita el día"));
         mes = Integer.parseInt(JOptionPane.showInputDialog("Digita el mes"));
         año = Integer.parseInt(JOptionPane.showInputDialog("Digita el año"));

         if (año != 0){
            if (mes >=1 && mes <= 12){

            
            if ((mes == 2) && (dia >= 1 && dia < 28)){

            
                JOptionPane.showMessageDialog(null, "La fecha es correcta");

                }
                else {
                    JOptionPane.showMessageDialog(null, "Fechas incorrecta, el día para el mes no cumple las condiciones");
                }

            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia < 30)){
                JOptionPane.showMessageDialog(null, "La fecha es correcta");
            } else{
                JOptionPane.showMessageDialog(null, "la fecha no es correcta");
            }


                
            }
            else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, el mes no cumple las condiciones");
            }
         } else{
             JOptionPane.showMessageDialog(null, "Fecha incorrecta, el año no cumple las condiciones");
         }
    }
}
