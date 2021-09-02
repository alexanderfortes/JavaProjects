package pkg0789_projeto_5;
import javax.swing.JOptionPane;
public class TestarFiguraGeometrica {
    // recorrendo ao método construtor
    public static void main(String[] args) {
        Object[] opcoes={"Rectangulo","Triangulo","Quadrado"};
       String Figura="";
        
        int escolha=JOptionPane.showOptionDialog(null, 
                "Selecione a figura", 
                "Classe Dimensão", 
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                null);
        
        switch(escolha){
            case 0 -> Figura="Rectangulo";
            case 1 -> Figura="Triangulo";
            default -> Figura="Quadrado";
        }
        
        int Alt=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Indique valor da altura"));
        int Bas=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Indique valor da base"));
        
     FiguraGeometrica Fg=new FiguraGeometrica(Alt, Bas, Figura);
        
        JOptionPane.showMessageDialog(null, 
                "A área do "+Figura+" é "+Fg.Area());
    }

}