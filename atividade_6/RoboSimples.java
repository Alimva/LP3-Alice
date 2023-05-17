public class RoboSimples {
    private  String nomeDoRobo;
    private int posicaoXAtual,posicaoYAtual;
    private String direcaoAtual;

    RoboSimples(String nome, int px, int py, String d){
        nomeDoRobo = nome;
        posicaoXAtual = px;
        posicaoYAtual = py;
        direcaoAtual = d;

        if(!validaRobo()){
            nomeDoRobo = "Wally";
            direcaoAtual = "N";
        }
    }

    RoboSimples(String nome){
        this(nome, 0, 0, "N");
    }

    RoboSimples(){
        this("Wally");
    }

    private boolean validaRobo(){
        if(nomeDoRobo == null){
            return false; 
        }
        if(direcaoAtual != "N" && direcaoAtual != "S" && direcaoAtual != "E" && direcaoAtual != "O"){
            return false;
        }
        return true;

    }

    public void move(){
        this.move(1);

    }

    public void move(int passos){
        if (direcaoAtual == "N") posicaoYAtual += passos;
        if (direcaoAtual == "S") posicaoYAtual -= passos;
        if (direcaoAtual == "E") posicaoXAtual += passos;
        if (direcaoAtual == "O") posicaoXAtual -= passos;
    }

    public void move(int passos, String d){
        direcaoAtual = d;
        if (direcaoAtual == "NE") posicaoYAtual += passos;
        if (direcaoAtual == "SE") posicaoYAtual -= passos;
        if (direcaoAtual == "NO") posicaoXAtual += passos;
        if (direcaoAtual == "SO") posicaoXAtual -= passos;
    }

    public void mudaDireção(String novaDirecao){
        direcaoAtual = novaDirecao;
    }

    public String toString(){
        String str = "\nNome do robo: "+nomeDoRobo+"\n";
        str = str + "Posicao do robo: ("+posicaoXAtual+", "+posicaoYAtual+")\n";
        str = str + "Direcao do robo: "+direcaoAtual;

        return str;
    }

}

