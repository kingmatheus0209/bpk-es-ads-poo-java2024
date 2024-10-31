public class Filme {

    public String titulo;
    public String diretor;
    public int duracao;

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void iniciar() {
        System.out.println("Iniciando o filme: " + titulo);
    }

    public void parar() {
        System.out.println("Parando o filme: " + titulo);
    }

    @Override
    public String toString() {
        return "Filme:" + titulo + ", Diretor: " + diretor + ", Duracao: " + duracao + " minutos";
    }
}