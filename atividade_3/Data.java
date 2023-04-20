public class Data {
    private int dia,mes,ano;

    private boolean data_valida(int dia, int mes, int ano) {
        if(mes < 12 && mes > 0){
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if(dia > 0 && dia < 32){
                    return true;
                }
            }
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if(dia > 0 && dia < 30){
                    return true;
                }
            }
            if(mes == 2){
                if(ano % 4 == 0){
                    if(dia > 0 && dia < 29){
                        return true;
                    }
                }
                else{
                    if(dia > 0 && dia < 28){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void inicializa_h(int ano, int mes, int dia){
        if(data_valida(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        else{
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
        }

    }

    public void mostra_data(){
        System.out.println(dia+"/"+mes+"/"+ano);
    }
}
