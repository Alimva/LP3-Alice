public class LivroB {
    private String titulo;
    private String autor;
    private String editora;
    private int ano;
    private boolean disponivel;


    public void cria_livro(String titulo, String autor, String editora, int ano,boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    public void print_livro() {
        System.out.println("Titulo : "+titulo);
        System.out.println("Autor : "+autor);
        System.out.println("Editora : "+editora);
        System.out.println("Ano : "+ano);
        System.out.println("Disponivel : "+disponivel);
    }

    
    public void levar() {
        if(disponivel == true){
            System.out.println("Livro "+titulo+" foi levado");
            disponivel = false;
        }
        else{
            System.out.println("Infelizmente, o livro "+ titulo + " nao esta disponivel");
        }
    }

    public void devolver() {
        if(disponivel == false){
            System.out.println("Obrigada");
            disponivel = true;
        }
        else{
            System.out.println("Voce ainda nao levou esse livro");
        }
    }
}
