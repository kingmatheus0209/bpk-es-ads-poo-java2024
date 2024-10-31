public class Computador {
    public String processador;
    public int memoriaRAM;
    public int armazenamento;
    public boolean ligado;

    public Computador(String processador, int memoriaRAM, int armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Computador ligado.");
        } else {
            System.out.println("O computador ja esta ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Computador desligado.");
        } else {
            System.out.println("O computador ja esta desligado.");
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Processador: " + processador);
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("Armazenamento: " + armazenamento + " GB");
        System.out.println("Estado: " + (ligado ? "Ligado" : "Desligado"));
    }
}