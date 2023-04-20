public class Livro{
    private String titulo;
    private String autor;
    private String editora;
    private int ano;

    public void cria_livro(String titulo, String autor, String editora, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }

    public void print_livro() {
        System.out.println("Titulo : "+titulo);
        System.out.println("Autor : "+autor);
        System.out.println("Editora : "+editora);
        System.out.println("Ano : "+ano);
    
    }
    
}