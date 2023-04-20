public class Linha {
    private int ponto1[] = new int[2] ;
    private int ponto2[] =new int[2];
    private int distancia;

    public void cria_ponto1(int x, int y) {
        ponto1[0] = x;
        ponto1[1] = y;
    }

    public void cria_ponto2(int x, int y) {
        ponto2[0] = x;
        ponto2[1] = y;
    }

    public void cria_linha(int x, int y) {
        distancia = (ponto1[0] - ponto2[0]) + (ponto1[1] - ponto2[1]);
        if(distancia < 0){
            distancia = distancia * -1;
        }
    }


}
