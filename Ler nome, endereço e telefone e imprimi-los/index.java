import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu endereço (nao precisa de por o numero da casa): ");
        String endereco = sc.nextLine();

        System.out.println("Digite seu telefone: ");
        int telefone = sc.nextInt();

        System.out.println("Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone);
    }
}