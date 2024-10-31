
public class TProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Cadeira", 150.00, 10);
        System.out.println(produto);

        produto.aumentarEstoque(5);
        produto.diminuirEstoque(3);
        System.out.println(produto);
        produto.aumentarEstoque(-2);
    }
}
