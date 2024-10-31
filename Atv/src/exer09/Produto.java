public class Produto {

    public String nome;
    public double preco;
    public int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
            System.out.println("Estoque aumentado em " + quantidade + " unidades.");
        } else {
            System.out.println("Quantidade invalida para aumento.");
        }
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Estoque diminuido em " + quantidade + " unidades.");
        } else {
            System.out.println("Quantidade invalida.");
        }
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preco: R$" + preco + ", Quantidade em Estoque: " + quantidadeEstoque;
    }
}