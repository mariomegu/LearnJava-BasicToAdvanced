import java.util.Scanner;

public class ClaseMath {

    public static void main (String[] args){

        //Raiz cuadrad

        double raiz2, raizresultado;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita un numero");

        raiz2 = entrada.nextDouble();
        raizresultado = Math.sqrt(raiz2);


        double raiz = Math.sqrt(9); //o int raiz = (int)Math.sqrt(9)
        

        System.out.println("la Raiz cuadrada de " + raiz2 + " es: " +raizresultado);


        //Exponente

        double base, exponente;

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digita la base ");
        base = entrada2.nextDouble();

        System.out.println("Digital el exponente");
        exponente = entrada2.nextDouble();

        double resultadoexpo = Math.pow(base, exponente);

        System.out.println("El resultado de elevar " + base + " al exponente " + exponente + " es igual a: " + resultadoexpo);



        //Redondear números
        double redondo;
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Digita un numero decimal");
        redondo = entrada3.nextDouble();

        long resultadoredondo = Math.round(redondo);
        System.out.println("El resultado al redondear " + redondo + " es igual a: " + resultadoredondo);

        //Numero Aleatorios
        double aleatorio = Math.random();
        System.out.println(aleatorio);

        


    }
    
}
