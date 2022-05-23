import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, suma, resta1, resta2, mult, div1, div2, residuo1, residuo2;

        System.out.print("Digite 2 números: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();

        suma = numero1 + numero2;
        resta1 = numero1 - numero2;
        resta2 = numero2 - numero1;
        mult = numero1 * numero2;
        div1 = numero1/numero2;
        div2 = numero2/numero1;
        residuo1 = numero1%numero2;
        residuo2 = numero2%numero1;

        System.out.println("El resultado de la suma de " + numero1 +" + "+ numero2 +" = "+ suma);
        System.out.println("El resultado de la resta de "+ numero1 + " - " + numero2 + " = " + resta1 );
        System.out.println("El resultado de la resta de " + numero2 + " - "+numero1 + " = " +resta2);
        System.out.println("El resultado de multiplicar " + numero1 + " x " + numero2 + " = "+mult);
        System.out.println("El resultado de Dividir "+ numero1 + " en " + numero2 + " = " +div1 );
        System.out.println("El resultado de Dividir "+ numero2 + " en "+ numero1 + " = " +div2);
        System.out.println("El resuduo de " + numero1 + " % " + numero2 + " = "+ residuo1);
        System.out.println("El residuo de " + numero2 + " % " + numero1 + " = " +residuo2);
        
    }
}
