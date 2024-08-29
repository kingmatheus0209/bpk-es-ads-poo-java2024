
public class Taluno{
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Joao", 12345, 1);
        aluno.adicionarNota(7.0);
        aluno.adicionarNota(8.0);
        aluno.adicionarNota(6.0);

        System.out.println(aluno);
    }
}
