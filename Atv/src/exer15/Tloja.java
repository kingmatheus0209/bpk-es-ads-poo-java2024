
public class Tloja {
    public static void main(String[] args) {
        Loja loja = new Loja("Loja Kingxs", "Rua Santa luzia, 123", "(11) 1234-5678");
        System.out.println(loja);

        loja.abrir();
        loja.fechar();
    }
}
