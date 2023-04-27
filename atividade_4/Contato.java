public class Contato {
    private String nome, email;
    private int telefone;
    private int[] dataNascimento = new int [3];

    public String get_nome() {
        return nome;
    }

    public String get_email() {
        return email;
    }

    public int[] get_data() {
        return dataNascimento;
    }

    public int get_telefone() {
        return telefone;
    }

    private boolean verificarData(int dia, int mes, int ano) {
        if(mes < 12 && mes > 0){
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if(dia > 0 && dia < 32){
                    return true;
                }
            }
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if(dia > 0 && dia < 30){
                    return true;
                }
            }
            if(mes == 2){
                if(ano % 4 == 0){
                    if(dia > 0 && dia < 29){
                        return true;
                    }
                }
                else{
                    if(dia > 0 && dia < 28){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void inicializarContato(String nome, String email, int telefone, int dia, int mes, int ano) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

        if(verificarData(dia, mes, ano)){
            dataNascimento[0] = dia;
            dataNascimento[1] = mes;
            dataNascimento[2] = ano;
        }else{
            dataNascimento[0] = 0;
            dataNascimento[1] = 0;
            dataNascimento[2]  = 0;
        }

    }

    public void imprimirContato(){
        System.out.println("Nome : "+ nome);
        System.out.println("Email : "+ email);
        System.out.println("Telefone : "+ telefone);
        System.out.println("Data de Nascimento : "+ dataNascimento[0] + "/"+ dataNascimento[1] +"/"+ dataNascimento[2]);
    }

    public int calcular_idade(){
        return 2023 - dataNascimento[2];
    }
}
