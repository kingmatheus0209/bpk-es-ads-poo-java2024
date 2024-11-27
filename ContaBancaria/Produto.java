package ContaBancaria;


import java.util.Objects;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public void setNome(String nome) {
        if(nome == null && nome.isEmpty()){
            System.out.println("Nome não pode ser vazio.");
            return;
        }
        this.nome = nome;
    }
    public void setPreco(double preco) {
        if(preco < 0){
            System.out.println("Preco não pode ser negativo");
            return;
        }
        this.preco = preco;
    }
    public void setEstoque(int quantidadeEstoque){
        if(quantidadeEstoque <= 0){
            System.out.println("Quantidade não pode ser negativa.");
            return;
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarEstoque(int qtd){
        if(qtd <= 0){
            System.out.println("Quantidade não pode ser negativa.");
            return;
        }
        quantidadeEstoque += qtd;
        System.out.println(qtd + " Quantidade adicionada ao estoque!");
    }
    public void diminuirEstoque(int qtd){
        if(qtd <= 0){
            System.out.println("Quantidade não pode ser negativa.");
            return;
        }
        if(quantidadeEstoque - qtd < 0){
            System.out.println("Quantidade insuficiente...");
            return;
        }
        quantidadeEstoque -= qtd;
        System.out.println(qtd + " Quantidade removida do estoque!");
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + hashCode() +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}