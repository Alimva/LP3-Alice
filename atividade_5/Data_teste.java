public class Data_teste {
    
    public static void main(String [] args) {
        Data d1 = new Data(6,7,2004);

        d1.imprimirData();
        d1.imprimirDataExtenso();
        System.out.println(d1.get_dia() + " " + d1.get_mes() + " " + d1.get_ano() + " "+ d1.dia_semana());

        Data d2 = new Data(6, 7, 2005);

        int num = d1.howManyDays(d2);

        System.out.println("Entre as datas d1 e d2 temos "+ num + " dias");

        num = d2.howManyDays(d1);

        System.out.println("Entre as datas d2 e d1 temos "+ num + " dias");
    
    }

}