public class Livro {
    public String titulo;
    public String autor;
    public int numPaginas;
    public int pagatual;

    public Livro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.pagatual = 0;
    }

    public void abrirLivro() {
        pagatual = 5;
        System.out.println("Livro está aberto na página " + pagatual);
    }

    public void lerlivro() {
        if (pagatual > 0 && pagatual <= numPaginas) {
            System.out.println("Página " + pagatual + " lida.");
        } else {
            System.out.println("Livro não aberto ou página inválida.");
        }
    }
}
