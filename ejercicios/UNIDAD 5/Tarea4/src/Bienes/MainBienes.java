package Bienes;

public class MainBienes {
    public static void main(String[] args) {

        Bienes b = new Bienes("Objeto generico", 50);
        Comida c = new Comida("Manzana", 2, 100);
        Juguete j = new Juguete("Coche juguete", 20, 3);
        Libro l = new Libro("Libro Java", 30, "Autor X");

        System.out.println(b);
        System.out.println(c);
        System.out.println(j);
        System.out.println("Impuesto juguete: " + j.calcularImpuesto());
        System.out.println(l);
        System.out.println("Impuesto libro: " + l.calcularImpuesto());
    }
}
    