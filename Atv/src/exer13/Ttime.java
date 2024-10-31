public class Ttime {
    public static void main(String[] args) {
        Time time = new Time("Jts de Pelotas", "King", 11);
        System.out.println(time);

        time.adicionarJogadores(3);
        time.removerJogadores(2);
        System.out.println(time);

        time.adicionarJogadores(2);
        time.removerJogadores(2);
    }
}