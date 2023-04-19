public class Conta {
    private String nome;
    private float saldo;
    private boolean especial;

    private boolean saldoi(int deposito){
        if(deposito < 0){
            return false;
        }
        return true;
    }

    public void abre_conta(String nome, int deposito, boolean especial) {
        this.nome = nome;
        
        if(!saldoi(deposito)){
            saldo = 0;
        }
        else{
            saldo = deposito;
        }

        this.especial = especial;
    }

    public void abre_simples(String nome) {
        this.nome = nome;
        saldo = 0;
        especial = false;
    }

    public void deposita(int deposito) {
        saldo += deposito;
    }

    public void retira(int valor){
        if(especial == false){
            if(saldo >= valor){
                saldo -= valor;
            }
        }
        else{
            saldo -= valor;
        }
    }

    public void mostra_dados() {
        System.out.println("Nome : "+ nome);
        System.out.println("Conta e especial?\n"+ especial);
        System.out.println("Saldo : R$"+ saldo);
    }
}
