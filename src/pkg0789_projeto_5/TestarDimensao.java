package pkg0789_projeto_5;
import javax.swing.JOptionPane;
public class TestarDimensao {
    
    public static void main(String[] args) {
        Object[] opcoes={"Rectangulo","Triangulo","Quadrado"};
        Dimensao Figura=new Dimensao();
        
        int escolha=JOptionPane.showOptionDialog(null, 
                "Selecione a figura", 
                "Classe Dimensão", 
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                null);
        
        switch(escolha){
            case 0 -> Figura.Tipo("Rectangulo");
            case 1 -> Figura.Tipo("Triangulo");
            default -> Figura.Tipo("Quadrado");
        }
        
        int Alt=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Indique valor da altura"));
        int Bas=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Indique valor da base"));
        
        Figura.Altura(Alt);
        Figura.Base(Bas);
        
        JOptionPane.showMessageDialog(null, 
                "A área do "+Figura.getTipo()+" é "+Figura.Area());
    }

}