import javax.swing.JOptionPane;

public class Ejercicio09_Condicionales {
    public static void main(String[] args){
        /**
         * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos lo meses son de 30 días
         */

         int dia, mes, año;

         dia = Integer.parseInt(JOptionPane.showInputDialog("Digita el número del día")); //Solicita el número del día
         
         

         if(dia >= 1 && dia < 30) //Valida si el número del día es correcto, es coso contrario imprime un mensaje y termina
         {
            mes = Integer.parseInt(JOptionPane.showInputDialog("Digita el número del mes")); //Sí día es correcto, continua con la condicional y ahora sí solicita el mes.

             if (mes >= 1 && mes < 12)
             {
                año = Integer.parseInt(JOptionPane.showInputDialog("Digita el número del año")); //Sí mes es correcto, continua con la condicional y ahora sí solicita el año

                 if (año != 0){
                     JOptionPane.showMessageDialog(null, "La fecha " + dia+ "/" + mes +"/" +año + " es correcta");

                 }else{
                     JOptionPane.showMessageDialog(null, "Fechas icorrecta, el año no cumple las condiciones");
                 }

             } else {
                 JOptionPane.showMessageDialog(null, "Fechas incorrecta, el mes no cumple las condiciones");
             }
         } else {
             JOptionPane.showMessageDialog(null, "Fechas incorrecta, el día no cumple las condiciones");
         }
    }
}
