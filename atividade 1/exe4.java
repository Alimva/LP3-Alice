import java.util.Scanner;


public class exe4 {
   public static void main(String [] args) {
      String [][] gabarito1 = {{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"}};
      String [][] gabarito2 = {{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"}};
      String [][] tab1 = {{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"}};
      String [][] tab2 = {{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"}};
      int navio1,navio2;

      navio1 = navio2 = 1;
      
      System.out.println("Bem vindo ao batalha naval!");
      
      while (navio1 <= 5) {
        navio1 = navio1 + criaGabarito(gabarito1);
        prnTabuleiro(gabarito1);

      }

      while (navio2 <= 5) {
        navio2 = navio2 + criaGabarito(gabarito2);
        prnTabuleiro(gabarito2);

      }

      System.out.println("Agora que os navios estao em suas posicoes vamos comecar o jogo");

      while(navio1 != 0 && navio2 != 0){
        
      }

   }

   public static int criaGabarito(String [][] gabarito) {
        
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com as coordenadas do navio: ");
        x = scanner.nextInt();
        y = scanner.nextInt();

        if(gabarito[x][y] == "-"){
            gabarito[x][y] = "@";
            return 1;
        }

        
        System.out.println("Essa coordenada já tem um navio");
        return 0;
        
    }

   public static void prnTabuleiro(String [][] tab){
      for(int i = 0; i < tab.length; i++){
          for(int j = 0; j < tab[i].length; j++){
              System.out.print(tab[i][j] + " ");
          }
          System.out.println(" ");
      }
  }
}
