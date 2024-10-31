package aula07;

public class carrot {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Carro", "ABC-1234", "Azul");
        System.out.println(veiculo);

        veiculo.abastecer();
        veiculo.lavar();
    }
}
