import java.util.Scanner;


public class retangulo {
    private int ponto1[] = new int[2];
    private int ponto2[] = new int[2];
    private int ponto3[] = new int[2];
    private int ponto4[] = new int[2];
    private int a,b,c;

    

    public void cria_vertices1() {
        int x,y;
        Ponto p = new Ponto();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com as coordenadas do navio: ");
        x = scanner.nextInt();
        y = scanner.nextInt();

        ponto1 = p.set_ponto(x, y);
        a = x;
        b = y;

        System.out.println("Entre com uma nova coordenada de y");
        y = scanner.nextInt();

        while(y == b){
            System.out.println("Coordenada invalida. Tente novamente");
            y = scanner.nextInt();
        }
        c = y;
        ponto2 = p.set_ponto(x, y);
    }

    public void cria_vertices2() {
        int x,y;
        Ponto p = new Ponto();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com as coordenadas do navio: ");
        x = scanner.nextInt();
        
        ponto3 = p.set_ponto(x, b);
        ponto4 = p.set_ponto(x, c);
    }

    private int distancia(int p[], int p2[]){
        int distancia = (p[0] - p2[0]) + (p[1] - p2[1]);
        if(distancia < 0){
            distancia = distancia * -1;
        }

        return distancia;
    }

    public int area(){
        int area = distancia(ponto1, ponto2) * distancia(ponto2, ponto4);
        return area;
    }

    public int perimetro() {
        int per = (distancia(ponto1, ponto2) + distancia(ponto2, ponto3)) * 2;
        return per;
    }

    
}
