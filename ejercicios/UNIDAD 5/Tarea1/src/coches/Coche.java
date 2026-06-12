package coches;

public class Coche extends Vehiculo {
    protected int marcha;
    protected int ruedas;

    public Coche(String nombre, int velocidad, int marcha, int ruedas) {
        super(nombre, velocidad);
        this.marcha = marcha;
        this.ruedas = ruedas;
    }

    public void cambiarMarcha(int nuevaMarcha) {
        this.marcha = nuevaMarcha;
    }
}
