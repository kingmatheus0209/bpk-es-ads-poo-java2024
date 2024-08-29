
public class Tjogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("King kong", "Acao", 99.99);
        System.out.println(jogo);

        jogo.iniciar();
        jogo.pausar();
    }
}
