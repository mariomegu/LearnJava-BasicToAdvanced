public class OperadoresIncrementoDecremento {
    public static void main(String[] args){

        int x = 10, z;

        int y = 15;

        x++; //= x+= 1; 0  x = x +1;

        y--; // y-= 1; o y = y -1;

        z = x++; //Primero hace la asignacion del valor actual de x a z y luego incrementa en 1 el valor de x
        z = ++x; //Primero incremnta el valor de x y luego lo asigna a z

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
    
}
