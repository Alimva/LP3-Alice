public class Ponto2D_teste {
    public static void main(String [] args){
        Ponto2D a = new Ponto2D(2,0);
        Ponto2D b = new Ponto2D(5,-1);

        System.out.println("Quadrante de a: "+a.quadrante());

        System.out.println("Quadrante de b: "+b.quadrante());

        System.out.println("Distancia entre a e b: "+a.distancia(b));
    }
}
