
public class Tanimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Elefante", 10, 5000.0);
        System.out.println(animal);

        animal.alimentar();
        animal.dormir();
    }
}

