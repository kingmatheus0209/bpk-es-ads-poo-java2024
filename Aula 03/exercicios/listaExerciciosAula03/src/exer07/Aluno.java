import java.util.ArrayList;
public class Aluno {
    public String nome;
    public int matricula;
    public int curso;
    public ArrayList<Double> notas;

    public Aluno(String nome, int matricula, int curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.size() == 0) {
            return 0.0;
        }
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", curso=" + curso +
                ", media=" + calcularMedia() +
                '}';
    }
}