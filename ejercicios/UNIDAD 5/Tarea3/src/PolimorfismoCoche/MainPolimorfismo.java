package PolimorfismoCoche;

public class MainPolimorfismo {
    public static void main(String[] args) {

        Coche c1 = new Deportivo("Ferrari", 8);
        Coche c2 = new Electrico("Tesla", 0);
        Coche c3 = new Camion("Volvo", 6);

        c1.arrancar();
        c1.acelerar();
        c1.frenar();

        c2.arrancar();
        c2.acelerar();
        c2.frenar();

        c3.arrancar();
        c3.acelerar();
        c3.frenar();
    }
}