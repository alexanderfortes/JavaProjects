package pkg0789_projeto_5;
public class FiguraGeometrica {
    private int Base, Altura;
    private String Tipo;

    //metodo construtor - é uma função que assume o mesmo nome da classe e vai conter um conjunto de parametros.
    public FiguraGeometrica(int Base, int Altura, String Tipo) {
        this.Base = Base;
        this.Altura = Altura;
        this.Tipo = Tipo;
    }

    public int Area() {
        int Area;
        Area = switch (Tipo){
            case "Rectangulo" -> Altura*Base;
            case "Triangulo" -> (Altura*Base)/2;
            default -> Altura * Altura;
        };
        return (Area);
    }
}
