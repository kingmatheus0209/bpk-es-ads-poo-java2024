public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentacaoPes() {
        System.out.println("Ola, meu nome e " + nome + ", tenho " + idade + " anos e minha altura e de " + altura + " metros.");
    }
}