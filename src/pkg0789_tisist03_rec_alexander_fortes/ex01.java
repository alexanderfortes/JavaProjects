package pkg0789_tisist03_rec_alexander_fortes;
import javax.swing.JOptionPane;
public class ex01 {
    /*
Crie um programa em Java que 
    cumprimente o utilizador. Se o mês do sistema estiver entre 1 e 7 escrever 
    “Há que trabalhar.”, entre 8 e 10 “Estamos de férias”, outro mês 
    “O Natal está a chegar”.
     */
    public static void main(String[] args) {
    int mes=Integer.parseInt(JOptionPane.showInputDialog(null,
              "Qual é o mês?")); 
        JOptionPane.showMessageDialog(null,
              contar(mes));
                 }
    public static String contar(int mes){
      do{
        if (mes<=7 && mes>1){
        return ("Há que trabalhar!");
    }
        else if (mes>8 && mes<10){
        return("Estamos de férias!");
                }
        return("O Natal está a chegar!");
}while (mes<1 || mes<=12);
}
}