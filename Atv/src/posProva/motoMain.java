package posProva;

public class motoMain {
    public static void main(String [] args){
        Motox moto = new Motox("Yamaha", "abc-123", 2009);

        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());

        moto.ligar();
        moto.desligar();
    }
}
