

public class Conta2 {
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
        
        if(!saldoi(deposito) && especial == false){
            System.out.println("Desculpe, essa conta nao pode ser aberta. Somente as nossas contas especiais podem ter saldo negativo.");
        }
        if(!saldoi(deposito)&& especial == true){
            System.out.println("Atencao! Seu saldo esta negativo");
            saldo = deposito;
            this.nome = nome;
            this.especial = especial;
        }
        else{
            saldo = deposito;
            this.nome = nome;
            this.especial = especial;
        }

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
