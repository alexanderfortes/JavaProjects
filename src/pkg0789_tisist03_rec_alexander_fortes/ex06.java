package pkg0789_tisist03_rec_alexander_fortes;
import java.util.Random;
public class ex06 {
    /*
Crie Crie um programa que gere aleatoriamente 
    números (entre 1 e 5) e os armazene numa matriz 3 x 3. No final deve 
    informar a soma dos números da diagonal direita e esquerda.
     */
    public static void main(String[] args) {
        int V[][] = new int[3][3];
        Random aleatorio = new Random();
        for (int a = 0; a < 5; a++){ 
            for (int b = 0; b < 5; b++) {
                V[a][b] = aleatorio.nextInt(5);
            }}
        System.out.println("A soma da diagonal direita é: "
        +(V[0][2]+V[1][1]+V[2][0]));
        System.out.println("A soma da diagonal esquerda é: "
                +(V[0][0]+V[1][1]+V[2][2]));
    }

}
