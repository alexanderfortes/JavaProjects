package pkg0791_t6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
import javax.swing.JOptionPane;

public class LigacaoMySql {
    
    String Estado="Não ligação.";
    
    public java.sql.Connection criarLigacao(){
        Connection con=null;
        try{
            String driver="com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            String caminho="jdbc:mysql://localhost:3306/"
                    +"dbpos?useTimezone=true&serverTimezone=UTC";
            String utilizador="root";
            String ppass="12345678";
            try{
                con=DriverManager.getConnection(caminho,utilizador,ppass);
                
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,
                        "Erro a criar a ligação.");
            }
            if(con!=null){
                Estado="Ligação efetuada.";
            }else{
                Estado="Não foi possível efetuar a ligação";
            }
            return con;
          }
        catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,
                    "Erro no driver.");
            return null;
        }
        }
    public String estadoLigacao(){
        return(Estado);
    }
}
