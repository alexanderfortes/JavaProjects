package pkg0791_t9;
import java.util.Random;

public class ServicoJogar {
    private String option[] = new String[]{"Pedra","Papel","Tesoura"};
    private String escolhaCPU;
    private String escolhaJogador;
    private int vitoriaCPU = 0;
    private int vitoriaJogador = 0;
    
    
    private String jogarCPU(){
        Random rand = new Random();
        int choice = rand.nextInt(3); 
        return option[choice];
    }
    
    public String jogar(String escolhaJogador){
        if(escolhaJogador == null || escolhaJogador.isBlank()){
            return "Escolha uma opção";
        }
        this.escolhaJogador = escolhaJogador;
        boolean escolhaValida = false;
        for(String o : option){
            if(escolhaJogador.equalsIgnoreCase(o)){
                escolhaValida = true;
                break;
            }
        }
        if(escolhaValida){
            this.escolhaCPU = jogarCPU();
            return validarVencedor(escolhaJogador,escolhaCPU);
        }
        return "Escolha uma opção válida";
    }
    
    private String validarVencedor(String escolhaJogador, String escolhaCPU){
        if(escolhaJogador.equalsIgnoreCase(escolhaCPU)){
            return "Empate";
        }else if(escolhaJogador.equalsIgnoreCase(option[0]) && escolhaCPU.equalsIgnoreCase(option[1])){
            vitoriaCPU++;
            return "Computador ganhou";
        }else if(escolhaJogador.equalsIgnoreCase(option[0]) && escolhaCPU.equalsIgnoreCase(option[2])){
            vitoriaJogador++;
            return "Jogador ganhou";
        }else if(escolhaJogador.equalsIgnoreCase(option[1]) && escolhaCPU.equalsIgnoreCase(option[0])){
            vitoriaJogador++;
            return "Jogador ganhou";
        }else if(escolhaJogador.equalsIgnoreCase(option[1]) && escolhaCPU.equalsIgnoreCase(option[2])){
            vitoriaCPU++;
            return  "Computador ganhou";
        }else if(escolhaJogador.equalsIgnoreCase(option[2]) && escolhaCPU.equalsIgnoreCase(option[0])){
            vitoriaCPU++;
            return  "Computador ganhou";
        }else if(escolhaJogador.equalsIgnoreCase(option[2]) && escolhaCPU.equalsIgnoreCase(option[1])){
            vitoriaJogador++;
            return  "Jogador ganhou";
        }
        return "Ocorreu um erro de escolhas";
    }
    public void reiniciarJogo(){
        escolhaCPU = null;
        escolhaJogador = null;
        vitoriaCPU = 0;
        vitoriaJogador = 0;
    }
    public String getEscolhaCPU(){
        return escolhaCPU;
    }
    public String getEscolhaJogador(){
        return escolhaJogador;
    }
    public int getVitoriaCPU() {
        return vitoriaCPU;
    }
    public int getVitoriaJogador() {
        return vitoriaJogador;
    }
    
}
