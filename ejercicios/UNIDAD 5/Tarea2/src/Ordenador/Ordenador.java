package Ordenador;

public class Ordenador {
    private String marca;
    private Procesador procesador;
    private Teclado teclado;
    private Pantalla pantalla;

    public Ordenador(String marca, Procesador procesador, Teclado teclado, Pantalla pantalla) {
        this.marca = marca;
        this.procesador = procesador;
        this.teclado = teclado;
        this.pantalla = pantalla;
    }

    private Procesador getProcesador() {
        return procesador;
    }

    private Teclado getTeclado() {
        return teclado;
    }

    private Pantalla getPantalla() {
        return pantalla;
    }

    public void iniciarOrdenador() {
        System.out.println("Se está iniciando el ordenador");
        procesador.arrancar();
        pantalla.encender();
    }

    public void escribirConOrdenador() {
        System.out.println("Se va a usar el ordenador para escribir");
        teclado.escribir();
    }
}