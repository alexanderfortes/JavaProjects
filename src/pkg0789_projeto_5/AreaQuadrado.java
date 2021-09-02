package pkg0789_projeto_5;
import javax.swing.JOptionPane;
public class AreaQuadrado {
    
    public static void main(String[] args) {
        Dimensao Quadrado=new Dimensao();
        
        Quadrado.Base(4);
        Quadrado.Tipo("Quadrado");
        
        JOptionPane.showMessageDialog(null, 
                "A área do quadrado é: "+(Quadrado.Area()));
    }
}