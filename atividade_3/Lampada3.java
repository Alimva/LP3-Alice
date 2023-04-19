public class Lampada3 {
    private String estado;
    
    public void acende(){
        estado = "Aceso";
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
    }

    public boolean esta_ligada() {
        if(estado == "Aceso"){
            return true;
        }
        else{
            return false;
        }
    }
}
