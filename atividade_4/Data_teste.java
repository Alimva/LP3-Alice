public class Data_teste {
    
    public static void main(String [] args) {
        Data d = new Data();

        d.inicializarData(6,7,2004);
        d.imprimirData();
        d.imprimirDataExtenso();
        System.out.println(d.get_dia() + " " + d.get_mes() + " " + d.get_ano());

        d.inicializarData(35, 1, 2001);
        d.imprimirData();
        d.imprimirDataExtenso();
    }

}

