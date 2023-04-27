public class lampada_teste {
    
    public static void main(String[] args) {
        Lampada l = new Lampada();

        l.acende();
        l.mostra_estado();

        l.apaga();
        l.mostra_estado();

        l.meia_luz(30);
        l.mostra_estado();

        l.meia_luz(70);
        l.mostra_estado();
    }
}
