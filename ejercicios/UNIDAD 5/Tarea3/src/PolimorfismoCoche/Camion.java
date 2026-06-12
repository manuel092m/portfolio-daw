package PolimorfismoCoche;

class Camion extends Coche {
    public Camion(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    public void arrancar() {
        System.out.println("El camión arranca lentamente");
    }

    public void acelerar() {
        System.out.println("El camión acelera con fuerza");
    }

    public void frenar() {
        System.out.println("El camión frena con aire");
    }
}