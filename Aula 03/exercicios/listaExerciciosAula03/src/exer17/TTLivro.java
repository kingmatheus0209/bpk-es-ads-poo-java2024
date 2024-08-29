
public class TTLivro {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("O Pequeno", "Mini Pan", 1.2);
        System.out.println(livro);

        livro.abrir();
        livro.fechar();
    }
}
