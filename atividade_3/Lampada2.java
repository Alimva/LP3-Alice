public class Lampada2 {
    private int estado;

    private boolean verifica_porcento(int porcento){
        if(porcento < 0 || porcento > 100){
            return false;
        }
        return true;
    }

    public void muda_estado(int porcento){
        if(verifica_porcento(porcento)){
            estado = porcento;
        }
        else{
            System.out.println("POrcentagem nao e valida!");

            if(porcento > 100){
                estado = 100;
            }
            else{
                estado = 0;
            }
        }
    }

    public void mostra_estado(){
        if(estado == 100){
            System.out.println("A lampada esta acesa");
        }
        if(estado == 0){
            System.out.println("A lampada esta apagada");
        }
        if(estado != 0 && estado != 100) {
            System.out.println("A sua lampada esta "+ estado +"% acesa");
        }
    }
}
