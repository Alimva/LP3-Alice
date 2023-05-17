public class Data_teste {
    
    public static void main(String [] args) {
        Data d1 = new Data(6,7,2004);
        Data d2 = new Data();
        Data d3 = new Data(d1);
    
        d1.imprimirData();
        d2.imprimirDataExtenso();
        System.out.println(d3.get_dia() + " " + d3.get_mes() + " " + d3.get_ano() + " "+ d1.dia_semana());

        Data d4 = new Data(6, 7, 2005);

        int num = d1.howManyDays(d4);

        System.out.println("Entre as datas d1 e d4 temos "+ num + " dias");

        num = d2.howManyDays(1960, 1, 1);

        System.out.println("Entre as datas d2 e d4 temos "+ num + " dias");
    
    }

}