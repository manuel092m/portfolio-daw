package PolimorfismoCoche;

public class Deportivo extends Coche {

    public Deportivo(String modelo, int cilindros) {
        super(modelo, cilindros);
    }
    public void arrancar() {
        System.out.println("El deportivo arranca rápido");
    }

    public void acelerar() {
        System.out.println("El deportivo acelera muy rápido");
    }

    public void frenar() {
        System.out.println("El deportivo frena con potencia");
    }
}


