package exer01;

public class Livro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private int pagAtual;

    public Livro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.pagAtual = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        if (pagAtual >= 0 && pagAtual <= numPaginas) {
            this.pagAtual = pagAtual;
        } else {
            System.out.println("Número de página inválido.");
        }
    }

    public void abrirLivro() {
        setPagAtual(5);
        System.out.println("Livro está aberto na página " + getPagAtual());
    }

    public void lerLivro() {
        if (getPagAtual() > 0 && getPagAtual() <= getNumPaginas()) {
            System.out.println("Página " + getPagAtual() + " lida.");
        } else {
            System.out.println("Livro não aberto ou página inválida.");
        }
    }
}
