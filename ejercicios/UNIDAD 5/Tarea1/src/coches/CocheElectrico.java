package coches;

public class CocheElectrico extends Coche{

    private int bateria;
    public CocheElectrico(String nombre, int velocidad, int marcha, int ruedas, int bateria) {
        super(nombre, velocidad, marcha, ruedas);
        this.bateria = bateria;
    }

    public void cargarBateria(int cantidad) {
        bateria += cantidad;
    }
}
