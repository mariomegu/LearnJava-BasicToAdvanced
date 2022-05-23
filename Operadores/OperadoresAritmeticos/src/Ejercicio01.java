import java.util.Scanner;

public class Ejercicio01 {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        double numero1, numero2, numero3, resultado;

        System.out.println("Digita 3 notas");

        numero1 = entrada.nextDouble();
        numero2 = entrada.nextDouble();
        numero3 = entrada.nextDouble();

        resultado = numero1+numero2+numero3;

        System.out.println("El resultado de las notas es " + resultado);

    }
    
}
