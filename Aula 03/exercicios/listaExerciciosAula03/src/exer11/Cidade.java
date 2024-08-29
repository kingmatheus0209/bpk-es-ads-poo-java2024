public class Cidade {

    public String nome;
    public int populacao;
    public String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            populacao += quantidade;
            System.out.println("Populacao aumentada em " + quantidade + " habitantes.");
        } else {
            System.out.println("Quantidade invalida.");
        }
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade > 0 && quantidade <= populacao) {
            populacao -= quantidade;
            System.out.println("Populacao diminuida em " + quantidade + " habitantes.");
        } else {
            System.out.println("Quantidade invalida ou populacao insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "Cidade: " + nome + ", Populacao: " + populacao + ", Estado: " + estado;
    }
}