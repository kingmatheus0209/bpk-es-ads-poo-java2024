public class LivroDigital {

    public String titulo;
    public String autor;
    public double tamanhoArquivo;


    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }


    public void abrir() {
        System.out.println("Abrindo o livro digital: " + titulo);
    }

    public void fechar() {
        System.out.println("Fechando o livro digital: " + titulo);
    }


    @Override
    public String toString() {
        return "LivroDigital: " + titulo + ", Autor: " + autor + ", Tamanho do Arquivo: " + tamanhoArquivo + " MB";
    }
}