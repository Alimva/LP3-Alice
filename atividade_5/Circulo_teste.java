public class Circulo_teste {
    public static void main(String [] args){
        Circulo c1 = new Circulo(1, 1, 5);
        Circulo c2 = new Circulo(4, 3, 10);
        Ponto2D p = new Ponto2D(0, 0);


        c1.imprimirCirculo();
        c2.imprimirCirculo();

        System.out.println("A area do circulo 1 e igual a "+ c1.area());

        System.out.println("A area do circulo 2 e igual a "+ c2.area());

        System.out.println("O perimetro do circulo 1 e igual a "+ c1.perimetro());

        System.out.println("O perimetro do circulo 2 e igual a "+ c2.perimetro());

        System.out.println("O ponto p esta no circulo 1?   "+ c1.isInnerPoint(p));

        System.out.println("O ponto p esta no circulo 2?   "+ c2.isInnerPoint(p));

        System.out.println("O circulo 1 e maior que o circulo 2?   "+ c1.isBiggerThan(c2));

        System.out.println("O circul0 c2 e maio que o circulo c1?   "+ c2.isBiggerThan(c1));

    }
}
