package pkg0789_tisist03_rec_alexander_fortes;
import javax.swing.JOptionPane;
public class ex05 {
    /*
Usando JOptionpane, crie um programa em Java que solicite ao utilizador o 
    nome e a idade e apresente numa MessageDialog na seguinte saída:
O seu nome é: Fernanda, a sua idade é 28 (nome seguido de virgula, espaço a 
    sua idade é idade)
     */
    public static void main(String[] args) {
        String nome=JOptionPane.showInputDialog(null,
                "Qual é o seu nome?");
        String idade=JOptionPane.showInputDialog(null,
                "Qual é a sua idade?");
        NomeIdade(nome, idade);
    }
    public static void NomeIdade(String nome, String idade){
        JOptionPane.showMessageDialog(null,
                "O seu nome é:  "+nome+", a sua idade é "+idade);
    }
    }
