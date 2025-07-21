import java.util.Scanner;

public class SistemaEscola{

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.println("---CADASTRO DE USUARIO---");
        System.out.println("---Cadastre o primeiro aluno---");

        System.out.println("Nome: ");
        aluno1.setNome(scanner.nextLine());
        System.out.println("CPF: ");
        aluno1.setCpf(scanner.nextLine());
        System.out.println("Idade: ");
        aluno1.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Email: ");
        aluno1.setEmail(scanner.nextLine());
        System.out.println("Usuario Ativo (true - false): ");
        aluno1.setUsuarioAtivo(scanner.nextBoolean());
        scanner.nextLine();
        System.out.println("Matricula: ");
        aluno1.setMatricula(scanner.nextInt());
        System.out.println("Serie: ");
        aluno1.setSerie(scanner.nextInt());

        aluno1.exibirInformacoes();

        System.out.println("---Cadastre o segundo aluno---");

        Aluno aluno2 = new Aluno();

        scanner.nextLine();
        System.out.println("Nome: ");
        aluno2.setNome(scanner.nextLine());
        System.out.println("CPF: ");
        aluno2.setCpf(scanner.nextLine());
        System.out.println("Idade: ");
        aluno2.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Email: ");
        aluno2.setEmail(scanner.nextLine());
        System.out.println("Usuario Ativo (true - false): ");
        aluno2.setUsuarioAtivo(scanner.nextBoolean());
        System.out.println("Matricula: ");
        aluno2.setMatricula(scanner.nextInt());
        System.out.println("Serie: ");
        aluno2.setSerie(scanner.nextInt());

        aluno2.exibirInformacoes();

        System.out.println("---Cadastre um professor---");

        Professor professor = new Professor();

        scanner.nextLine();
        System.out.println("Nome: ");
        professor.setNome(scanner.nextLine());
        System.out.println("CPF: ");
        professor.setCpf(scanner.nextLine());
        System.out.println("Idade: ");
        professor.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Email: ");
        professor.setEmail(scanner.nextLine());
        System.out.println("Usuario Ativo (true - false): ");
        professor.setUsuarioAtivo(scanner.nextBoolean());
        System.out.println("Salario: ");
        professor.setSalario(scanner.nextInt());

        professor.exibirInformacoes();

    }
}