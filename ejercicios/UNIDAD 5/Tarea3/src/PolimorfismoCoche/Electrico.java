package PolimorfismoCoche;

class Electrico extends Coche {
    public Electrico(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    public void arrancar() {
        System.out.println("El coche eléctrico arranca en silencio");
    }

    public void acelerar() {
        System.out.println("El coche eléctrico acelera instantáneamente");
    }

    public void frenar() {
        System.out.println("El coche eléctrico usa frenado regenerativo");
    }
}