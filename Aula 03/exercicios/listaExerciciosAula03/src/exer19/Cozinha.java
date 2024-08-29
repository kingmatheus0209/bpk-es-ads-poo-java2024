public class Cozinha {

    public String tipo;
    public int quantidadePessoas;
    public String cor;


    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("Cozinhando na cozinha do tipo " + tipo + ".");
    }

    public void limpar() {
        System.out.println("Limpando a cozinha da cor " + cor + ".");
    }


    @Override
    public String toString() {
        return "Cozinha [Tipo: " + tipo + ", Quantidade de Pessoas: " + quantidadePessoas + ", Cor: " + cor + "]";
    }
}