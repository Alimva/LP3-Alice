public class Contato_teste {
    public static void main(String [] args){
        Contato c = new Contato("ALice","alicia.mar.val@gmail.com", 91457006, 06, 07, 2004);
        Contato c1 = new Contato("Beto", "bb.org@gmailcom",11,03,2009);

        c.imprimirContato();
        c1.imprimirContato();

        System.out.println("Idade atual: "+ c.calcular_idade());
        System.out.println("Idade atual: "+ c1.calcular_idade());
    }
}
