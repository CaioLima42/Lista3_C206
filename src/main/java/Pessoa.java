public class Pessoa {

    public String nome;
    public int cpf;
    Endereco enderecos[];

    public Pessoa(String nome, int cpf,int qntEnd) {
        this.nome = nome;
        this.cpf = cpf;
        if(qntEnd != 0)
            enderecos = new Endereco [qntEnd];
    }
    public void addEndereco(Endereco end){
        for (int i = 0; i < enderecos.length;i++)
            if (enderecos[i] == null) {
                this.enderecos[i] = end;
                break;
            }
    }
    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        for (int i = 0; i < enderecos.length; i++)
            if(enderecos[i] != null) {
                System.out.println("Endereco " + (i+1));
                System.out.println("RUA: " + enderecos[i].rua);
                System.out.println("Bairro: " + enderecos[i].bairro);
                System.out.println("Numero: " + enderecos[i].num);
            }
    }
}
