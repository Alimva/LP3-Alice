public class Ponto2D {
    private int x,y;

    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int get_x(){
        return x;
    }

    public int get_y(){
        return y;
    }

    public void imprimirPonto(){
        System.out.println(x + ","+ y);
    }

    public boolean isEixoX(){
        if(y == 0){
            return true;
        }
        return false;
    }

    public boolean isEixoY(){
        if(x == 0){
            return true;
        }
        return false;
    }

    public boolean isEixos(){
        if(x == 0 && y == 0){
            return true;
        }
        return false;
    }

    public int quadrante(){
        if(x > 0 && y > 0){
            return 1;
        }
        if(x < 0 && y > 0){
            return 2;
        }
        if(x < 0 && y < 0){
            return 3;
        }
        if(x > 0 && y < 0){
            return 4;
        }
        return 0;
    }

    public double distancia(Ponto2D a){
        double distancia;

        distancia = ((x - a.get_x()) * (x - a.get_x())) + ((y - a.get_y()) * (y - a.get_y()));
        return Math.sqrt(distancia);
    }
}
