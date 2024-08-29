import java.util.Scanner;
public class Banco{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ContaBancaria minhaConta = new ContaBancaria("123456", 500.0);

    int opcao;

    do {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opcao: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o valor para deposito: ");
                double valorDeposito = scanner.nextDouble();
                minhaConta.depositar(valorDeposito);
                break;

            case 2:
                System.out.print("Digite o valor para saque: ");
                double valorSaque = scanner.nextDouble();
                minhaConta.sacar(valorSaque);
                break;

            case 3:
                minhaConta.consultarSaldo();
                break;

            case 4:
                System.out.println("Saindo.");
                break;

            default:
                System.out.println("Opcao invalida. Tente novamente.");
        }
    } while (opcao != 4);

    scanner.close();
}
}