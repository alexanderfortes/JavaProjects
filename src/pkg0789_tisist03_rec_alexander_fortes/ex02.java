package pkg0789_tisist03_rec_alexander_fortes;
import javax.swing.*;
import java.util.Random;
import static javax.swing.JOptionPane.showMessageDialog;

public class ex02 {
    /*
Crie um programa em Java que gere um 
    nº entre 0 e 2. Se 0 escrever “CARA”, se 1 escrever “COROA” senão escrever 
    “Volte a tentar”.
     */
    public static void main(String[] args) {
        Random num = new Random();
        int numero = num.nextInt(2);
        switch (numero) {
            case 0:
                showMessageDialog(null, "Cara");
                break;
            case 1:
                showMessageDialog(null, "Coroa");
                break;
            default:
                JOptionPane.showConfirmDialog(null,
                        "VOlte a tentar");
                break;
        }
    }

   

}




