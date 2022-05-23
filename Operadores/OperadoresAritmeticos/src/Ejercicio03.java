import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args){
        //Guillermo tiene N dólares. Luis tiene la mitad de los que posee Guillermo. Juan tiene la mitad de lo que posee Luis y Guillermo juntos. Hacer un programa que  calcule e imprima la cantidad de dinero que tienen lo tres.

        Scanner entradaDatos = new Scanner(System.in);

        float dineroGuillermo, dineroJuan, dineroLuis, dineroJuntos, dineroTotal;

        System.out.println("Cuántos dólares tiene Guillermo?");
        dineroGuillermo = entradaDatos.nextFloat();

        dineroLuis = dineroGuillermo / 2;
        dineroJuntos = dineroGuillermo + dineroLuis;
        dineroJuan = dineroJuntos / 2;
        dineroTotal = dineroGuillermo + dineroJuan + dineroLuis;

        System.out.println("El dinero total es $: "+ dineroTotal + " dólares");
        System.out.println("Guillermo tiene $" + dineroGuillermo + " dólares");
        System.out.println("Luis tiene $" + dineroLuis+ " dólares");
        System.out.println("Juan tiene $" +dineroJuan+ " dólares");

    }
    
}
