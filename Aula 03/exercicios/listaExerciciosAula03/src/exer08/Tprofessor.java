public class Tprofessor{
public static void main(String[] args) {
    Professor prof = new Professor("Silva", "Matematica", 5000.00);
    System.out.println(prof);
    prof.darAula();
    prof.corrigirProvas();
}
}