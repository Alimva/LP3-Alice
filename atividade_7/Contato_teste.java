public class Contato_teste {
    public static void main(String [] args){
        Contato c = new Contato("ALice","alicia.mar.val@gmail.com", 91457006, 06, 07, 2004);
        Contato c1 = new Contato("Beto","beto@gmail.com", 91690800, 11, 03, 2009);
        Contato c2 = new Contato("Sabrina","sabrina@gmail.com", 988117593, 11, 01, 1976);


        c.imprimirContato();
        System.out.println("Idade em 2023: "+ c.calcular_idade());
        c.quantos_cont();
    }
}
