public class TCozinha {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Gourmet", 10, "Branca");
        System.out.println(cozinha);

        cozinha.cozinhar();
        cozinha.limpar();
    }
}
