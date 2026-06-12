package coches;

public class Vehiculo {
    protected String nombre;
    protected int velocidad;

    public Vehiculo(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }
    public void acelerar(int cantidad) {
        velocidad += cantidad;
    }

    public void desacelerar(int cantidad) {
        velocidad -= cantidad;
    }

}
