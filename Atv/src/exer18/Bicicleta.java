public class Bicicleta {

    public String marca;
    public String modelo;
    public double tamanhoRoda;

    public Bicicleta(String marca, String modelo, double tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }


    public void pedalar() {
        System.out.println("Pedalando a bicicleta " + modelo + " da marca " + marca + ".");
    }

    public void frear() {
        System.out.println("Freando a bicicleta " + modelo + " da marca " + marca + ".");
    }


    @Override
    public String toString() {
        return "Bicicleta Marca: " + marca + ", Modelo: " + modelo + ", Tamanho da Roda: " + tamanhoRoda + " polegadas";
    }
}