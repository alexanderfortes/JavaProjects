package pkg0789_projeto_5;
import javax.swing.JOptionPane;
public class AreaRectangulo {
    /*
Area de um Retangulo
     */
    public static void main(String[] args) {
     Dimensao Rectangulo=new Dimensao();
     Rectangulo.Altura(10);
     Rectangulo.Base(5);

     Rectangulo.Tipo("Rectangulo");
     
     JOptionPane.showMessageDialog(null,
             "A ára do rectangulo é:"+Rectangulo.Area());
    }

}
