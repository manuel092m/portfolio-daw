package Bienes;
public class Libro extends Bienes implements Imponible {

    private String autor;

    public Libro(String descripcion, double precio, String autor) {
        super(descripcion, precio);
        this.autor = autor;
    }

    public double calcularImpuesto() {
        return precio * TASA;
    }

    public String toString() {
        return super.toString() + ", Autor: " + autor;
    }
}
