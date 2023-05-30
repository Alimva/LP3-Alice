public class Data_teste {
    
    public static void main(String [] args) {
        Data d = new Data(6,7,2004);
        Data d1 = new Data(31, 1, 2001);

        Data.dayToPrintShort(d);
        Data.dayToPrintLong(d);
        System.out.println("Faltam "+Data.howManyDaysUntilNextMonth(d)+ " dias até o dia 1 do próximo mes");
        System.out.println("Faltam "+Data.howManyDaysUntilEndYear(d)+ " dias até o fim do ano");

        Data.dayToPrintShort(d1);
        Data.dayToPrintLong(d1);
        System.out.println("Faltam "+Data.howManyDaysUntilNextMonth(d1)+ " dias até o dia 1 do próximo mes");
        System.out.println("Faltam "+Data.howManyDaysUntilEndYear(d1)+ " dias até o fim do ano");

    }

}
