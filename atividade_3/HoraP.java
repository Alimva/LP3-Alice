public class HoraP {
    private int hora,minuto,segundo,centesimo;

    private boolean hora_valida(int hora) {
        if(hora < 0 || hora > 24){
            return false;
        }
        else{
            return true;
        }
    }

    private boolean ms_valido(int minuto){
        if(minuto < 0 || minuto > 60){
            return false;
        }
        else{
            return true;
        }
    }

    private boolean centesimo_valido(int minuto){
        if(minuto < 0 || minuto > 100){
            return false;
        }
        else{
            return true;
        }
    }

    private void ajuste(){
        if(centesimo == 100){
            centesimo = 0;
            segundo += 1;
        }
        if(segundo == 60){
            segundo = 0;
            minuto += 1;
        }
        if(minuto == 60){
            minuto = 0;
            hora += 1;
        }
        if(hora == 25){
            hora = 1;
        }
    }

    public void inicializa_h(int hora, int minuto, int segundo, int centesimo){
        if(hora_valida(hora)){
            this.hora = hora;
        }
        else{
            this.hora = 0;
        }

        if(ms_valido(minuto)){
            this.minuto = minuto;
        }
        else{
            this.minuto = 0;
        }

        if(ms_valido(segundo)){
            this.segundo = segundo;
        }
        else{
            this.segundo = 0;
        }

        if(centesimo_valido(centesimo)){
            this.centesimo = centesimo;
        }
        else{
            this.centesimo = 0;
        }

        ajuste();
    }

    public void mostra_hora(){
        System.out.println(hora+":"+minuto+":"+segundo+":"+centesimo);
    }

}
