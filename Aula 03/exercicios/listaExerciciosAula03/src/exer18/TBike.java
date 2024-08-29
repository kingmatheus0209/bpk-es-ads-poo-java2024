

public class TBike {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Explorer", 26.0);
        System.out.println(bicicleta);

        bicicleta.pedalar();
        bicicleta.frear();
    }
}