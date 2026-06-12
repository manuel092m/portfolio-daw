package Bienes;

public class Bienes {

    protected String descripcion;
    protected double precio;

    public Bienes(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;

    }


    public String toString() {
        return "Descripcion: " + descripcion + ", Precio: " + precio;
    }
}
