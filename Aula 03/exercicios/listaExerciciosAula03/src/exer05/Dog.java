public class Dog {
    public String nome;
    public String raca;
    public int idade;

    public Dog(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;

    }

    public void latir() {
        System.out.println(nome + " esta latindo au au au!");
    }

    public void correr() {
        System.out.println(nome + " esta correndo");
    }

    public void inform() {
        System.out.println("Nome:" + nome);
        System.out.println("Raca:" + raca);
        System.out.println("Idade:" + idade);
    }
}