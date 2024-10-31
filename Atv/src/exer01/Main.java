package exer01;

public class Main {
    public static void main(String[] args) {
        Livro meulivro = new Livro("Diario de um banana", "Jeff Kinney", 100);
        System.out.println("Titulo: " + meulivro.getTitulo());
        System.out.println("Autor: " + meulivro.getAutor());

        meulivro.abrirLivro();
        meulivro.lerLivro();
    }
}