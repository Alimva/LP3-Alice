public class DataS {
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

    public String dia_semana(){
        int chave,s;

        chave = (ano % 100);
        chave = ((chave / 4)+(chave % 7))/ 7;

        if(mes == 4 || mes == 7){
            s = dia + chave;
            s -= s/7;
        }
        if(mes == 1 || mes == 10){
            s = dia + chave + 1;
            s -= s/7;
        }
        if(mes == 5){
            s = dia + chave + 2;
            s -= s/7;
        }
        if(mes == 8){
            s = dia + chave + 3;
            s -= s/7;
        }
        if(mes == 2 || mes == 3 || mes == 11){
            s = dia + chave + 4;
            s -= s/7;
        }
        if(mes == 6){
            s = dia + chave + 5;
            s -= s/7;
        }
        if(mes == 9 || mes == 12){
            s = dia + chave + 6;
            s -= s/7;
        }

        if(s == 0){
            return "Sabado";
        }
        if(s == 1){
            return "Domingo";
        }
        if(s == 2){
            return "Segunda";
        }
        if(s == 3){
            return "Terca";
        }
        if(s == 4){
            return "Quarta";
        }
        if(s == 5){
            return "Quinta";
        }
        if(s == 6){
            return "Sexta";
        }
    }
}
