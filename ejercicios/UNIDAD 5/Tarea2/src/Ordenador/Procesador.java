package Ordenador;

public class Procesador {
    private String modelo;

    public Procesador(String modelo) {
        this.modelo = modelo;
    }

    public void arrancar() {
        System.out.println("El procesador se ha arrancado");
    }

    public String getModelo() {
        return modelo;
    }
}