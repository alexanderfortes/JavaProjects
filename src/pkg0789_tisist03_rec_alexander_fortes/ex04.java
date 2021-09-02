package pkg0789_tisist03_rec_alexander_fortes;
import javax.swing.*;
import java.util.Scanner;
public class ex04 {
    /*
Usando a classe Scanner, crie um programa em Java que solicite ao 
    utilizador 10 números inteiros e os armazene num vetor. 
    Mostre os valores e informe quantos números são ímpares.
     */
    public static void main(String[] args) {
    int numero=0;
   Scanner ler=new Scanner (System.in);
      for (int i = 1; i <= 10; i++) {
       int num=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Indique um número inteiro:"));
      }
      numero=ler.nextInt();
       if (numero % 2 != 0) {
          JOptionPane.showMessageDialog(null,
                "Introduziu " +numero+ " números ímpares");
    }
        }
    }

