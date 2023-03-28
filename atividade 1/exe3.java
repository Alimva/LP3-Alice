import java.util.Random;

public class exe3 {
    public static void main(String [] args) {
        int dados [] = {0,0};
        int lancamento = 1;
        int ponto = 0;
        boolean ganhou = false;

        dado(dados);
        System.out.println("Soma: "+(dados[0]+dados[1]));
       
        if(lancamento == 1){
            
            if((dados[0]+dados[1]) == 7 || (dados[0]+dados[1]) == 11 ){
                ganhou = true;
                lancamento++;
            }
            if((dados[0]+dados[1]) == 2 || (dados[0]+dados[1]) == 3 || (dados[0]+dados[1]) == 12 ){
                lancamento++;
            
        }

        if (lancamento == 1) {

            ponto = dados[0]+dados[1];
            System.out.println("Seu ponto e "+ponto);
            System.out.println("Iniciando a segunda rodada");

            do {
                dado(dados);
                System.out.println("Soma: "+(dados[0]+dados[1]));
            
                if(dados[0]+dados[1] == ponto){
                    ganhou = true;
                }
            } while ((dados[0]+dados[1]) != 7 && (dados[0]+dados[1]) != ponto);
        }

        if(ganhou){
            System.out.println("Voce ganhou!");
        } else {
            System.out.println("Voce perdeu!");
        }
    }
    }

    public static void dado(int dados[]) {
        dados[0] = (int) (Math.random()*6)+1;
        dados[1] = (int) (Math.random()*6)+1;
        System.out.println("Dado 1: " + dados[0] + " Dado 2: " + dados[1]);
        
    }

}
