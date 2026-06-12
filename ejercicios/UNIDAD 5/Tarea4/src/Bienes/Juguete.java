package Bienes;

public class Juguete extends Bienes implements Imponible {

    private int edadMinima;

    public Juguete(String descripcion, double precio, int edadMinima) {
        super(descripcion, precio);
        this.edadMinima = edadMinima;
    }

    public double calcularImpuesto() {
        return precio * TASA;
    }

    public String toString() {
        return super.toString() + ", Edad minima: " + edadMinima;
    }
}