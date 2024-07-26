import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome,agencia;
        int numero;
        double saldo;

        System.out.println("Conta Bancaria");
        System.out.println("Digite o numero da conta:");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumindo a nova linha pendente
        System.out.println("Digite o numero da agencia:");
        agencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente:");
        nome = scanner.nextLine();
        System.out.println("Digite o saldo da conta:");
        saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");



    }
}