package pkg0789_tisist03_rec_alexander_fortes;
public class ex03 {
    /*
Usando um ciclo, crie um programa em Java que produza o seguinte output:
**********(10)
*********(09)
********(08)
*******(07)
******(06)
*****(05)
     */
    public static void main(String[] args) {
     int contador=10;
   for(int i=1;i<=6;i++){
       for(int j=1;j<=contador;j++){
           System.out.print("*");
       }
       System.out.print("("+contador+")");
       contador--;
       System.out.println();
   }
    }

}
