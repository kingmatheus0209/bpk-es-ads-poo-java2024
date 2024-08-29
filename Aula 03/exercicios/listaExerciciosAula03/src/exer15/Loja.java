public class Loja {

    public String nome;
    public String endereco;
    public String telefone;


    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void abrir() {
        System.out.println("A loja " + nome + " esta aberta.");
    }

    public void fechar() {
        System.out.println("A loja " + nome + " esta fechada.");
    }

    @Override
    public String toString() {
        return "Loja: " + nome + ", Endereco: " + endereco + ", Telefone: " + telefone ;
    }
}