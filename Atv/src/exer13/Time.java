public class Time {

    public String nome;
    public String tecnico;
    public int numeroDeJogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public void adicionarJogadores(int quantidade) {
        if (quantidade > 0) {
            numeroDeJogadores += quantidade;
            System.out.println("Jogadores adicionados. Total de jogadores: " + numeroDeJogadores);
        } else {
            System.out.println("Quantidade invalida para adicionar.");
        }
    }

    public void removerJogadores(int quantidade) {
        if (quantidade > 0 && quantidade <= numeroDeJogadores) {
            numeroDeJogadores -= quantidade;
            System.out.println("Jogadores removidos. Total de jogadores: " + numeroDeJogadores);
        } else {
            System.out.println("Quantidade invalida ou jogadores insuficientes.");
        }
    }

    @Override
    public String toString() {
        return "Time: " + nome + ", Tecnico: " + tecnico + ", Numero de Jogadores: " + numeroDeJogadores;
    }
}