import java.util.Scanner;

public class SistemaEscola{

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();

        System.out.println("---CADASTRO DE USUARIO---");

        System.out.println("Nome: ");
        pessoa1.setNome(scanner.nextLine());
        System.out.println("CPF: ");
        pessoa1.setCpf(scanner.nextInt());
        System.out.println("Idade: ");
        pessoa1.setIdade(scanner.nextInt());
        System.out.println("Email: ");
        pessoa1.setEmail(scanner.nextLine());
        System.out.println("Usuário Ativo (1 - sim | 0 - não): ");
        pessoa1.setUsuarioAtivo(scanner.nextBoolean());

        pessoa1.exibirInformacoes();

    }
}