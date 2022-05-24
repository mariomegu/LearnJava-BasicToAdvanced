import javax.swing.JOptionPane;

public class Ejercicio04 {
    public static void main (String [] args) throws Exception{
        //En megaplaza se hace un 20% de descuento a los clietes cuya compra superes los $300. ¿Cuál será la cantidad que pagará una persona por su compra?

        int promo=300;
        float valorCompra, valorPagar, descuento;

        valorCompra = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la compra")); //Transforma el dato de entrada en un valor de tipo float

        if (valorCompra > promo){
            descuento = valorCompra*0.20f;
            valorPagar = valorCompra - descuento;
            JOptionPane.showMessageDialog(null, "El valor a pagar es: " + valorPagar);
        } else {
            JOptionPane.showMessageDialog(null, "El valor a pagar es: "+valorCompra);
        }



    }
}
