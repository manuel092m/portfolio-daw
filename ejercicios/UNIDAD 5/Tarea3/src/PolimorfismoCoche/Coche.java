package PolimorfismoCoche;

public class Coche {
    private String modelo;
    private boolean motor;
    private int ruedas;
    private int cilindros;

    public Coche(String modelo, int cilindros) {
        this.modelo = modelo;
        this.cilindros = cilindros;
        ruedas = 4;
        motor = true;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void arrancar(){
        System.out.println("PolimorfismoCoche.Coche arrancando");
    }

    public void acelerar(){
        System.out.println("PolimorfismoCoche.Coche acelerando");
    }

    public void frenar(){
        System.out.println("PolimorfismoCoche.Coche frenando");
    }
}
