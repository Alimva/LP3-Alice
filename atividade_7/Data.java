import java.util.Calendar;

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

    Data(int dia, int mes, int ano){
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

    public String imprimirDataExtenso(){
        String mes;
        String str;
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


    public static int howManyDaysUntilEndYear(Data d){
        int dias = 0;

        for(int i = d.mes; i < 12; i++){
            if(i == d.mes){
                if (i% 2 == 1 || i == 8){
                    dias += (31 - d.dia);
                }
                if(i == 2 && d.ano % 4 == 0){
                    dias += (29 - d.dia);
                }
                if(i == 2 && d.ano % 4 == 1){
                    dias += (28 - d.dia);
                }
                else{
                    dias += (30 - d.dia);
                }
            }else if (i% 2 == 1 || i == 8){
                dias += 31;
            }else if(i == 2 && d.ano % 4 == 0){
                dias += 29;
            }else if(i == 2 && d.ano % 4 == 1){
                dias += 28;
            }else{
                dias += 30;
            }
            
        }

        return dias;
    }

    public static int howManyDaysUntilNextMonth(Data d){
        int dias = 0;

        
        if (d.mes% 2 == 1 || d.mes == 8){
            dias += 32 - d.dia;
        }else if(d.mes == 2 && d.ano % 4 == 0){
            dias += 30 - d.dia;
        }else if(d.mes == 2 && d.ano % 4 == 1){
            dias += 29 - d.dia;
        }else{
            dias += 31 - d.dia;
        }
        
        
        return dias;
    }

    public static boolean isBissexto(Data d){
        if(d.ano % 4 == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static String dayOfWeek(Data d){
        int formula,s;
        
        if(d.mes == 01 ) // mês de janeiro será o mês 13 do ano anterior.
        {
            d.mes = 13;
            d.ano = d.ano - 1;
        }
        
        if(d.mes == 02 ) // mês de favereiro será o mês 14 do ano anterior.
        {
            d.mes = 14;
            d.ano = d.ano - 1;
        
        } 
        
        formula = d.dia + 2*d.mes + (3*(d.mes+1)/5) + d.ano + d.ano/4 - d.ano/100 + d.ano/400 + 2;  // Formula para calcular o dia da semana.
        s = formula % 7;                                                     // Resto da divisão do valor encontrado na formula por 7.

        if (d.mes == 13) // Se for mês de Janeiro, coloca o valor certo do Mês e do Ano para mostrar na tela.
        {
            d.mes = 1;
            d.ano = d.ano+1;
        }
        if (d.mes == 14) // Se for mês de Fevereiro, coloca o valor certo do Mês e do Ano para mostrar na tela.
        {
            d.mes = 2;
            d.ano = d.ano +1;
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

    public static String dayToPrintShort(Data d){
        String str = Integer.toString(d.dia) +"/"+ Integer.toString(d.mes) +"/"+ Integer.toString(d.ano);
        return str;
    }

    public static String dayToPrintLong(Data d){
        String str;
        String mes;

        switch (d.mes) {
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
        return str = d.dia+ " de "+ mes + " de "+ d.ano;
    }
    
}
