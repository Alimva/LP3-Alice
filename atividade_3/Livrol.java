public class Livrol {
    private String titulo;
    private String autor;
    private String editora;
    private int ano,carrinho;
    private float preco,ptotal;

    public void cria_livro(String titulo, String autor, String editora, int ano,float preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.preco = preco;

    }

    public void print_livro() {
        System.out.println("Titulo : "+titulo);
        System.out.println("Autor : "+autor);
        System.out.println("Editora : "+editora);
        System.out.println("Ano : "+ano);
        System.out.println("Preço : R$"+preco);
    }

    private boolean valida_quant(int quant){
        if(quant>0){
            return true;
        }
        else{
            return false;
        }
    }

    private boolean valida_retira(int quant){
        if(quant > carrinho){
            return false;
        }
        else{
            return true;
        }
    }

    public void inclui_carrinho(int quant){
        if(valida_quant(quant)){
            carrinho += quant;
            ptotal += preco * quant;
        }
        else{
            System.out.println("Quantidade inválida");

        }
    }

    public void retira_carrinho(int quant){
        if(valida_retira(quant)){
            carrinho -= quant;
            ptotal -= preco * quant;
        }
        else{
            System.out.println("Quantidade inválida");
        }
    }

    public void print_carrinho() {
        System.out.println("Livro : "+titulo);
        System.out.println("Quantidade : "+carrinho);
        System.out.println("Preço : "+preco);
        System.out.println("Quantidade no carrinho : "+ carrinho);
        System.out.println("Total : R$"+ptotal);

    }

}
