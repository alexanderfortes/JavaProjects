package pkg0789_tisist03_rec_alexander_fortes;

import javax.swing.JOptionPane;

public class ex07 {
    /*
O programa  abaixo listado pretende solicitar 
    ao utilizador um número inteiro e apresentar a tabuada da soma desse número
    no seguinte formato:
    7 + 1 = 8
7 + 2 = 9
….
7 + 10 = 17
     */
    public static void main(String[] args) {
     int numero=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite um número inteiro"));
         for(int i=1;i<=10;i++){
            System.out.println(numero+" + "+i+" = "+(numero+i));
         }
    }
}
    


