public class Contato_teste {
    public static void main(String [] args){
        Contato c = new Contato();

        c.inicializarContato("ALice","alicia.mar.val@gmail.com", 91457006, 06, 07, 2004);
        c.imprimirContato();
        System.out.println("Idade em 2023: "+ c.calcular_idade());
    }
}
