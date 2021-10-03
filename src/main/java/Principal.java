import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        String nome;
        int cpf;
        System.out.println("Digite o nome da pessoa: ");
        nome = imput.nextLine();
        System.out.println("Digite o cpf da pessoa: ");
        cpf = imput.nextInt();
        System.out.println("Digite quantos endereços a pessoa tem: ");
        int qnt = imput.nextInt();
        imput.nextLine();
        Pessoa pessoa = new Pessoa(nome, cpf,qnt);
        for(int i = 0; i<qnt; i++)
        {
            System.out.println("Digite a rua do " + (i+1) + " endereço: ");
            String rua = imput.nextLine();
            System.out.println("Digite o bairro do " + (i+1) + " endereço: ");
            String bairro = imput.nextLine();
            System.out.println("Digite o numero do " + (i+1) + " endereço: ");
            int num = imput.nextInt();
            imput.nextLine();
            Endereco endereco = new Endereco(rua, bairro, num);
            pessoa.addEndereco(endereco);
        }
        pessoa.mostraInfo();




    }
}
