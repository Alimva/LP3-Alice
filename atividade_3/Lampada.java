public class Lampada {
    private String estado;

    public void acende(){
        estado = "Aceso";
    }

    public void meia_luz(){
        estado = "Meia-luz";
    }

    public void apaga(){
        estado = "Apagado";
    }

    public void mostra_estado(){

        if(estado == "Aceso"){
            System.out.println("A lampada esta acesa");
        }
        if(estado == "Apagado"){
            System.out.println("A lampada esta apagada");
        }
        if (estado == "Meia-luz") {
            System.out.println("A lampada esta em meia-luz");
        }
    }
}
