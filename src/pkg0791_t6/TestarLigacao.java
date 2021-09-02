
package pkg0791_t6;
import javax.swing.JOptionPane;
public class TestarLigacao {
    public static void main(String[] args){
        LigacaoMySql bd=new LigacaoMySql();
        bd.criarLigacao();
        JOptionPane.showMessageDialog(null,
                bd.estadoLigacao());
    }
}
