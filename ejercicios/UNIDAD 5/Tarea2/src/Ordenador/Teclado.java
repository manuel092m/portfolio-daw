package Ordenador;

public class Teclado {
    private String tipo;

    public Teclado(String tipo) {
        this.tipo = tipo;
    }

    public void escribir() {
        System.out.println("Se está escribiendo con el teclado");
    }

    public String getTipo() {
        return tipo;
    }
}