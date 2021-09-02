package pkg0789_tisist03_rec_alexander_fortes;
import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;
public class ex08 {
    /*
     Desenvolva um programa em Java que permita
    calcular o resultado de um questionário aplicado a um determinado 
    número de famílias. O programa deverá responder aos seguintes requisitos: 
    Perguntar ao utilizador quantas famílias responderam ao questionário. 
    Para cada família perguntar:
• Residência:(1-Continente 2-Açores 3-Madeira)
• Idade do pai:
• Idade da mãe:
• Quantos filhos:
• Rendimento familiar:
Os resultados das seguintes consultas devem ser apresentados após a 
    fase de recolha dos dados:
• Quantas famílias residem no continente e em cada uma das ilhas.
• Qual o número médio de filhos por casal.
• Rendimento médio familiar dos casais com 2 filhos ou menos.
• Quantidade de famílias com mais do que dois filhos.
• Idade média dos pais.
     */
    public static void main(String[] args) {
       int numero=0;
        int num= parseInt(JOptionPane.showInputDialog(null,
              "Quantas famílias responderam ao questionário"));
      for (int i=1; i<=num; i++){
          numero++;
          String primeira=JOptionPane.showInputDialog(null,
                  "Qual é a sua residência?");
           int segunda=Integer.parseInt(JOptionPane.showInputDialog(null,
                  "Qual é a idade do pai?"));

          int terceira=Integer.parseInt(JOptionPane.showInputDialog(null,
                  "Qual é a idade da mãe?"));
          int quarta=Integer.parseInt(JOptionPane.showInputDialog(null,
                  "Quantos filhos?"));
          int quinta=Integer.parseInt(JOptionPane.showInputDialog(null,
                  "Qual o rendimento familiar?"));
    }
      JOptionPane.showMessageDialog(null,""
              );

}
}