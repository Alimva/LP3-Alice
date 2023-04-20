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
