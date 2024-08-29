public class Main {
    public static void main(String[] args) {
        Livro meulivro = new Livro("Titulo: Diario de um banana", "Autor: Jeff Kinney", 100);
        System.out.println("Titulo: " + meulivro.titulo);
        System.out.println("Autor: " + meulivro.autor);

        meulivro.abrirLivro();
        meulivro.lerlivro();
    }
}
