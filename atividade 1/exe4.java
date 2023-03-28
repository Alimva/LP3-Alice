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
        navio1 = navio1 + criaGabarito(gabarito1,1);

      }

      while (navio2 <= 5) {
        navio2 = navio2 + criaGabarito(gabarito2,2);

      }

      System.out.println("Agora que os navios estao em suas posicoes vamos comecar o jogo");

      while(navio1 != 0 && navio2 != 0){

        navio1 = navio1 - tiro(1, gabarito1, tab1, 2);

        navio2 = navio2 - tiro(2, gabarito2, tab2, 1);
      }

      if(navio1 == 0){
        System.out.println("O jogador 1 venceu");
      }

      if(navio2 == 0){
        System.out.println("O jogador 2 venceu");
      }

   }

   public static int tiro(int player1, String [][] gabarito, String [][] tab, int player2) {
      int x,y;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Entre com as coordenadas do navio: ");
      x = scanner.nextInt();
      y = scanner.nextInt();

      while(x > 4 || y > 4 || x < 0 || y < 0){
        System.out.println("Entre com as coordenadas corretas");
        x = scanner.nextInt();
        y = scanner.nextInt();
      }

      while(tab[x][y] == "O" || tab[x][y] == "X"){
        System.out.println("Voce ja atirou aqui. Tente de novo");
        x = scanner.nextInt();
        y = scanner.nextInt();
      }

      if(gabarito[x][y] == "@"){
          tab[x][y] = "X";
          System.out.println("Jogador "+ player1 +" afundou o navio do jogador "+ player2);
          return 1;
      } 


      tab[x][y] = "O";
      System.out.println("Voce "+ player1 +" errou");
      return 0;
   }


   public static int criaGabarito(String [][] gabarito,int player) {
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com as coordenadas do navio jogador"+player+" :");
        x = scanner.nextInt();
        y = scanner.nextInt();

        if(x > 4 || y > 4 || x < 0 || y < 0){
          System.out.println("Coordenadas invalidas.");
          return 0;
        }

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
