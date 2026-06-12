package Figuras;

import java.util.Scanner;

public class MainPolimorfismo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShapeOperable figura = null;

        System.out.println("Elige figura: 1.Circulo 2.Cuadrado 3.Triangulo");
        int opcion = sc.nextInt();

        System.out.println("Introduce dimension (lado o radio): ");
        double valor = sc.nextDouble();

        switch (opcion) {
            case 1:
                figura = new Circulo(valor);
                System.out.println("Has elegido: Circulo");
                break;
            case 2:
                figura = new Cuadrado(valor);
                System.out.println("Has elegido: Cuadrado");
                break;
            case 3:
                figura = new TrianguloEquilatero(valor);
                System.out.println("Has elegido: Triangulo Equilatero");
                break;
        }

        System.out.println("¿Que quieres calcular? 1.Area 2.Perimetro");
        int calc = sc.nextInt();

        if (calc == 1) {
            System.out.println("Area: " + figura.calcularArea());
        } else {
            System.out.println("Perimetro: " + figura.calcularPerimetro());
        }
    }
}