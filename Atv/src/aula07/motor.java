package aula07;

public class motor {

    private String modelo;
    private int potencia; // Mudança para 'int' para refletir a natureza numérica da potência
    private String tipoCombustivel;
    private int cilindradas;
    private boolean ligado;
    private int rpm;

    public motor(String modelo, int potencia, String tipoCombustivel, int cilindradas) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.cilindradas = cilindradas;
        this.ligado = false;
        this.rpm = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public boolean isLigado() { // 'isLigado' é comum para atributos booleanos
        return ligado;
    }

    public int getRpm() {
        return rpm;
    }

    // Métodos set
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    // Métodos da classe
    public void ligar() {
        if (!ligado) {
            ligado = true;
            rpm = 1000;
            System.out.println("Motor ligado.");
        } else {
            System.out.println("Motor já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            rpm = 0;
            System.out.println("Motor desligado.");
        } else {
            System.out.println("Motor já está desligado.");
        }
    }

    public void aumentarPotencia(int incremento) {
        if (ligado) {
            potencia += incremento;
            System.out.println("Potência aumentada em " + incremento);
        } else {
            System.out.println("Carro está desligado.");
        }
    }

    public void diminuirPotencia(int decremento) {
        if (ligado && potencia >= decremento) {
            potencia -= decremento;
            System.out.println("Potenc  i diminuída em " + decremento);
        } else {
            System.out.println("Carro está desligado ou decremento maior que a potência atual.");
        }
    }

    public void acelerar(int incrementoRpm) {
        if (ligado) {
            rpm += incrementoRpm;
            System.out.println("RPM aumentado em " + incrementoRpm);
        } else {
            System.out.println("Motor está desligado.");
        }
    }

    public void reduzirRpm(int decrementoRpm) {
        if (ligado && decrementoRpm <= rpm) {
            rpm -= decrementoRpm;
            System.out.println("RPM reduzido em " + decrementoRpm);
        } else {
            System.out.println("Carro está desligado ou decremento maior que o RPM atual.");
        }
    }
}
