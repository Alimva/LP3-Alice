public class Circulo {
    private int x, y, raio;
    private float pi = 3.1415F;

    public Circulo(int x, int y, int raio){
        if(validaCirculo(raio)){
            this.x =x;
            this.y = y;
            this.raio = raio;
        }
        else{
            this.x =0;
            this.y = 0;
            this.raio = 0;
        }
    }

    private boolean validaCirculo(int raio){
        if(raio > 0){
            return true;
        }
        return false;
    }

    public void set_x(int x){
        this.x = x;
    }

    public void set_y(int y){
        this.y = y;
    }

    public void set_raio(int raio){
        if(validaCirculo(raio)){
            this.raio = raio;
        }

        this.raio = 0;
    }

    public int get_x(){
        return x;
    }

    public int get_y(){
        return y;
    }

    public int get_raio(){
        return raio;
    }

    public void imprimirCirculo(){
        System.out.println("O centro desse circulo fica nas coordenadas("+x+","+y+") e ele tem um raio de "+raio);
    }

    public boolean isInnerPoint(Ponto2D p){
        Ponto2D aux = new Ponto2D(x, y);

        if(aux.distancia(p) < raio){
            return true;
        }
        return false;
    }

    public float area(){
        return 2*pi*(raio*raio);
    }

    public float perimetro(){
        return 2 * pi * raio;
    }

    public boolean isBiggerThan(Circulo c){
        if(this.area() > c.area()){
            return true;
        }
        return false;
    }
}
