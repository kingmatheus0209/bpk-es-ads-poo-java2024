package posProva;

public class Motox {

    private String marca;
    private String modelo;
    private int ano;

    public Motox(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void ligar(){
        System.out.println("Ligar moto");
    }
    public void desligar(){
        System.out.println("Desligar moto");
    }
}

