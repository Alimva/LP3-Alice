public class Data {
    private int dia,mes,ano;


    public int get_dia(){
        return dia;
    }

    public int get_mes(){
        return mes;
    }

    public int get_ano(){
        return ano;
    }

    private boolean verificarData(int dia, int mes, int ano) {
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

    public void inicializarData(int dia, int mes, int ano){
        if(verificarData(dia, mes, ano)){
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

    public void imprimirData(){
        System.out.println(dia+"/"+mes+"/"+ano);
    }

    public void imprimirDataExtenso(){
        String mes;
        switch (this.mes) {
            case 1:
                mes = "Janeiros";
                break;
            
            case 2:
                mes = "Fevereiro";
                break;
            
            case 3:
                mes = "Marco";
                break;
            
            case 4:
                mes = "Abril";
                break;

            case 5:
                mes = "Maio";
                break;
            
            case 6:
                mes = "Junho";
                break;

            case 7:
                mes = "Julho";
                break;

            case 8:
                mes = "Agosto";
                break;
            
            case 9: 
                mes = "Setembro";
                break;
            
            case 10:
                mes = "Outubro";
                break;
            
            case 11:
                mes = "Novembro";
                break;

            case 12:
                mes = "Dezembro";
                break;

            default:
                System.out.println("A data colocada não é valida");
                mes = "Zero";
                break;
        }

        System.out.println(dia+ " de "+ mes + " de "+ ano);
    } 
}