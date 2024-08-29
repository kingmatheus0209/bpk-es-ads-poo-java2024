public class Celular {
    public String marca;
    public String modelo;
    public int bateria;

    public Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void ligarCell() {
        if (bateria > 0) {
            System.out.println("Celular ligado, bateria: " + bateria);
        } else {
            desliCell();
        }
    }

    public void desliCell() {
        System.out.println("Celular desligado. Bateria insuficiente: " + bateria);
    }
}