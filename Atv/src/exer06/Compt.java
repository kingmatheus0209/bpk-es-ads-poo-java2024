import java.util.Scanner;
public class Compt{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Computador meuComputador = new Computador("Intel i7", 16, 512);
    meuComputador.mostrarInformacoes();

    System.out.println("Digite 1 para ligar o computador ou 0 para desligar:");
    int escolha = scanner.nextInt();

    if (escolha == 1) {
        meuComputador.ligar();
    } else if (escolha == 0) {
        meuComputador.desligar();
    } else {
        System.out.println("Opcao invalida. Digite 1 para ligar ou 0 para desligar.");
    }

    scanner.close();
}
}