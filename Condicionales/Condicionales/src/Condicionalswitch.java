import javax.swing.JOptionPane;

public class Condicionalswitch {

    public static void main (String[] args){

        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digita un número entre 1 y 5"));

        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "El número digitado es 1");
                break;
            case 2: JOptionPane.showMessageDialog(null, "El número digitado es 2");
                break;
            case 3: JOptionPane.showMessageDialog(null, "El número digitado es 3");
                break;
            case 4: JOptionPane.showMessageDialog(null, "El número digitado es 4");
                break;
            case 5: JOptionPane.showMessageDialog(null, "El número digitado es 5");
                break;   
            default: JOptionPane.showMessageDialog(null, "Por favor digite un número entre 1 y 5"); 


        }

    }
    
}
