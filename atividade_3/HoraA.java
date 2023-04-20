public class HoraA {
    private int hora,minuto;

    private boolean hora_valida(int hora) {
        if(hora < 0 || hora > 24){
            return false;
        }
        else{
            return true;
        }
    }

    private boolean minuto_valido(int minuto){
        if(minuto < 0 || minuto > 60){
            return false;
        }
        else{
            return true;
        }
    }
    private void ajuste(){
        if(minuto == 60){
            minuto = 0;
            hora += 1;
        }
        if(hora == 25){
            hora = 1;
    }
}

    public void inicializa_h(int hora, int minuto){
        if(hora_valida(hora)){
            this.hora = hora;
        }
        else{
            this.hora = 0;
        }

        if(minuto_valido(minuto)){
            this.minuto = minuto;
        }
        else{
            this.minuto = 0;
        }
        ajuste();

    }

    public void mostra_hora(){
        System.out.println(hora+":"+minuto);
    }
}
