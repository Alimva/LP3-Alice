
public class exe2 {
    public static void main(String [] args) {
        int teste1[] = {10,10,10,10,10,10,10,10,10,10};
        int teste2[] = {1,2,1,2,1,2,1,2,1,2};
        int teste3[] = {7,9,10,11,13,14,15,16,17,18};
        float media1,media2,media3;
        float dp1,dp2,dp3;

        media1 = media2 = media3 = 0;
        dp1 =  dp2 =  dp3 = 0;

        for (int i = 0; i < 10; i++) {
            media1 =  media1 + teste1[i];
            media2 = media2 + teste2[i];
            media3 = media3 + teste3[i];
        }

        media1 = media1 / 10;
        media2 = media2 / 10;
        media3 = media3 / 10;

        for (int i = 0; i < 10; i++) {
            dp1 = (media1 - teste1[i])*(media1 - teste1[i]);
            dp2 = (media2 - teste2[i])*(media2 - teste2[i]);
            dp3 = (media3 - teste3[i])*(media3 - teste3[i]);
        }

        dp1 = dp1 / 10;
        dp2 = dp2 / 10;
        dp3 = dp3 / 10;



        System.out.println("Foram feitas 3 leituras no multimetro.");
        prnVet("Primeira Leitura: ", teste1);
        prnVet("Segunda Leitura: ", teste2);
        prnVet("Terceira Leitura: ", teste3);

        if(dp1 < (media1/10)){
            System.out.println("A leitura 1 foi correta pois "+ dp1 +"e menor que "+ (media1/10));

        }

        else{
            System.out.println("A leitura 1 foi incorreta pois "+dp1 +" e maior que 10% de"+media1);
        }

        if(dp2 < (media2/10)){
            System.out.println("A leitura 2 foi correta pois "+dp2+" e menor que "+media2);

        }

        else{
            System.out.println("A leitura 2 foi incorreta pois "+dp2+"e maior que 10% de "+media2);
        }

        if(dp3 < (media3/10)){
            System.out.println("A leitura 3 foi correta pois "+dp3+" e menor que "+media3);

        }

        else{
            System.out.println("A leitura 3 foi incorreta pois N"+dp3+" e maior que 10% de "+media3);
        }
        
    }

    public static void prnVet(String msg, int [] vet){
        System.out.println(msg);
        for(int i = 0; i < vet.length; i++)
                System.out.print(vet[i] + " ");
        System.out.println();        
    }
    
}