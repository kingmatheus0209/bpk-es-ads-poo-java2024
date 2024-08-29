public class TFilme {
    public static void main(String[] args) {
        Filme filme = new Filme("Aventura do macaco cego", "Peter pan", 120);
        System.out.println(filme);

        filme.iniciar();
        filme.parar();
    }
}