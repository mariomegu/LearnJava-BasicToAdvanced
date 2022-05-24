import javax.swing.JOptionPane;

public class Ejercicio05_Condicionales {
    public static void main (String[] args) throws Exception{
        /*
        Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
        * Si trabaja 40 horas o menos se le paga $16 por hora
        * Si trabaja más de 40 horas se le paga $16 por las primeras 40 horas y $20 por cada hora extra
        */

        float horasTrabajadas, pagoSemanal, horasExtras, pagoHorasExtra, pagoTotal;

        horasTrabajadas = Float.parseFloat(JOptionPane.showInputDialog("Cuantas horas trabajo?"));

        if(horasTrabajadas <= 40){
            pagoSemanal = horasTrabajadas * 16f;
            JOptionPane.showMessageDialog(null, "El pago semanal es de: $"+pagoSemanal);

        } else{
            horasExtras = horasTrabajadas - 40f; //Calcula la cantidad de horas extras

            pagoHorasExtra = horasExtras*20f; //Calcula el pafo por las horas extras

            pagoTotal = (40*16)+pagoHorasExtra; //Define el pago total, sabiendo que ya trabajo 40 y cada hora con un valor de $16, a esto se le suman las horas extras.

            JOptionPane.showMessageDialog(null, "El pago semanl es de: $" +pagoTotal);

        }

    }
}
