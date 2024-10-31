public class Jogo {

    public String nome;
    public String genero;
    public double preco;


    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciar() {
        System.out.println("Iniciando o jogo: " + nome);
    }

    public void pausar() {
        System.out.println("Pausando o jogo: " + nome);
    }


    @Override
    public String toString() {
        return "Jogo [Nome: " + nome + ", Genero: " + genero + ", Preco: R$" + preco + "]";
    }
}