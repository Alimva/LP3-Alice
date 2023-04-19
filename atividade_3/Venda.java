public class Venda {
    
    private int carrinho,quant_estoque;
    private float ptotal, preco;
    private String marca;

    
    private boolean verifica_preco(float preco){
        if(preco > 0){
            return true;
        }
        return false;
    }

    private boolean verifica_quantes(int quant){
        if(quant >= 0){
            return true;
        }
        return false;
    }

    private boolean verifica_quant(int quant){
        if((quant_estoque - quant) >= 0){
            return true;
        }
        return false;
    }

    private boolean verifica_carrinho(int quant){
        if((carrinho - quant) >= 0){
            return true;
        }
        return false;
    }
    
    public void cria_lampada(String marca, float preco,int quant){
        this.marca = marca;
        
        if(verifica_preco(preco)){
            this.preco = preco;
        }
        else{
            System.out.println("Preco invalido!");
            this.preco = 0;     
        }

        if(verifica_quantes(quant)){
            quant_estoque = quant;
        }
        else{
            System.out.println("Quantidade Invalida!!");
        }
    }

    public void adiciona_carrinho(int quant){

        if(verifica_quant(quant)){
            quant_estoque -= quant;
            carrinho += quant;
            ptotal = quant * preco;
        }
        else{
            System.out.println("Quantidade e maior que o estoque!");
        }
    }

    public void remove_carrinho(int quant){

        if(verifica_carrinho(quant)){

            carrinho -= quant;
            ptotal -= (preco * quant);
        }
        else{
            System.out.println("Quantidade e maior que o conteudo do carrinho!");
        }
    }

    public void mostra_carrinho(){
        System.out.println("Produto : Lampada");
        System.out.println("Marca : "+ marca);
        System.out.println("Preco : R$"+ preco);
        System.out.println("Quantidade : "+ carrinho);
        System.out.println("Preco total da compra : R$"+ ptotal);
    }

}
