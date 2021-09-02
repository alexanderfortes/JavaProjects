package pkg0789_projeto_5;
import javax.swing.JOptionPane;
public class AreaTriangulo {

    public static void main(String[] args) {
        Dimensao Triangulo=new Dimensao();
        
        Triangulo.Altura(4);
        Triangulo.Base(4);
        Triangulo.Tipo("Triangulo");
        
        JOptionPane.showMessageDialog(null, 
        "A área do triângulo é: "+(Triangulo.Area()));
    }

}
