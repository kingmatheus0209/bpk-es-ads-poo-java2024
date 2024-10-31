package exer02;

public class Celular {
    private String marca;
    private String modelo;
    private int bateria;

    public Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty())
            this.marca = marca;
        else {
            System.out.printf("Marca invalida");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
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
