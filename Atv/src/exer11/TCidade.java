
public class TCidade {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Acaraje", 1200, "Amapa"); //
        System.out.println(cidade);

        cidade.aumentarPopulacao(5000);
        cidade.diminuirPopulacao(1000);
        System.out.println(cidade);

        cidade.aumentarPopulacao(-2000);
        cidade.diminuirPopulacao(20);
    }
}