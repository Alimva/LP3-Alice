public class Ponto2d_teste {
    public static void main(String [] args){
        Ponto2D a = new Ponto2D();
        Ponto2D b = new Ponto2D();

        a.set_ponto(2, 0);
        System.out.println("Quadrante de a: "+a.quadrante());

        b.set_ponto(5, -1);
        System.out.println("Quadrante de b: "+b.quadrante());

        System.out.println("Distancia entre a e b: "+a.distancia(b));
    }
}
