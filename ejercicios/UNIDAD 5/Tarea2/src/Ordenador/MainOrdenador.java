package Ordenador;

public class MainOrdenador {
    public static void main(String[] args) {
        Procesador procesador = new Procesador("Intel i5");
        Teclado teclado = new Teclado("Mecanico");
        Pantalla pantalla = new Pantalla(24);

        Ordenador ordenador = new Ordenador("HP", procesador, teclado, pantalla);

        ordenador.iniciarOrdenador();
        ordenador.escribirConOrdenador();
    }
}