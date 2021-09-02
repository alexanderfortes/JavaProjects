
package pkg0789_projeto_5;
public class Dimensao {
    // Altura e Base são as variáveis membro da classe.
    private int Altura,Base;
    private String Tipo;
    
    // O método Area devolve o cálculo da área.
    public int Area(){
        int Area;
        if(Tipo.equals("Rectangulo")){
            Area=Altura*Base;
        }
        else if(Tipo.equals("Triangulo")){
            Area=(Altura*Base)/2;
        }
        else{
            Area=(Altura*Altura);
        }
        return(Area);
    }
    // Criar um método public para atribuir o valor à variável Altura.
    public void Altura(int Altura){
        this.Altura=Altura;
    }
    public void Base(int Base){
        this.Base=Base;
    }
    public void Tipo(String Tipo){
        this.Tipo=Tipo;
    } 
    public String getTipo(){
        return(this.Tipo);
    }
}



