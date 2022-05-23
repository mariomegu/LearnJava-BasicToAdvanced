import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Ejercicio02 {
    public static void main(String[] args){
        //Calcula el salario de un empleado a partir de sus horas semanales y de su salario por hora

        Scanner entrada = new Scanner(System.in);

        double hora, horasSemanales, pagoSalario;

        double salarioHora = 25;

        System.out.println("Cuántas horas laboró el empleado?");
        hora =  entrada.nextDouble();

        pagoSalario = hora*salarioHora;
        System.out.println("El valor de salario semanal para el empleado es de $"+pagoSalario);

    }
    
}
