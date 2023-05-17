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

    public Data(int dia, int mes, int ano){
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
    
    public boolean isPrev(Data d) {
        if(d.get_ano() < ano){
            return true;
        }
        if(d.get_ano() == ano){
            if(d.get_mes() < mes){
                return true;
            }
            else{
                if(d.get_dia() < dia){
                    return true;
                }
            }
        }
        return false;
    }

    public int howManyDays(Data d) {
        int anomin = (ano >=d.get_ano()) ? d.get_ano():ano;
        int anomax = (ano >=d.get_ano()) ? ano:d.get_ano();
        int mesmin = (mes >=d.get_mes()) ? d.get_mes():mes;
        int mesmax = (mes >=d.get_mes()) ? mes:d.get_mes();
        int diamin = (dia >=d.get_dia()) ? d.get_dia():dia;
        int diamax = (dia >=d.get_dia()) ? dia:d.get_dia();
        int dias = 0;

        while(anomin < anomax){
            if(anomin%4 == 0){
                dias += 366;
            }
            else{
                dias += 365;
            }
            anomin++;
        }

        while(mesmin < mesmax){
            if(mesmin % 2 == 1 || mesmin == 8){
                dias += 31;
            }
            if(mesmin == 2 && anomax % 4 == 0){
                dias += 29;
            }
            if(mesmin == 2 && anomax % 4 == 1){
                dias += 28;
            }
            else{
                dias += 30;
            }
            mesmin++;
        }
        dias += diamax - diamin;

        if(isPrev(d)){
            dias = dias * -1;
        }


        return dias;
    }

    public String dia_semana(){
        int formula,s;
        
        if(mes == 01 ) // mês de janeiro será o mês 13 do ano anterior.
        {
            mes = 13;
            ano = ano - 1;
        }
        
        if(mes == 02 ) // mês de favereiro será o mês 14 do ano anterior.
        {
            mes = 14;
            ano = ano - 1;
        
        } 
        
        formula = dia + 2*mes + (3*(mes+1)/5) + ano + ano/4 - ano/100 + ano/400 + 2;  // Formula para calcular o dia da semana.
        s = formula % 7;                                                     // Resto da divisão do valor encontrado na formula por 7.

        if (mes == 13) // Se for mês de Janeiro, coloca o valor certo do Mês e do Ano para mostrar na tela.
        {
            mes = 1;
            ano = ano+1;
        }
        if (mes == 14) // Se for mês de Fevereiro, coloca o valor certo do Mês e do Ano para mostrar na tela.
        {
            mes = 2;
            ano = ano +1;
        }

        switch (s) {
            case 0:
                return "Sabado";
            
            case 1:
             return "Domingo";
            
            case 2:
                return "Segunda";
            
            case 3:
                return "Terça";

            case 4:
                return "Quarta";

            case 5:
                return "Quinta";

            default:
                return "Sexta";
        }
    }
}
