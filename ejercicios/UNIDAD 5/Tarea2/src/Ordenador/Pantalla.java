package Ordenador;

public class Pantalla {
    private int pulgadas;

    public Pantalla(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void encender() {
        System.out.println("La pantalla se ha encendido");
    }

    public int getPulgadas() {
        return pulgadas;
    }
}