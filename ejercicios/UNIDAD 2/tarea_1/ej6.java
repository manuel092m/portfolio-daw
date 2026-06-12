import java.util.Scanner;

public class ej6 {
    public static void run(Scanner sc) {

        String piece;
        System.out.println("Introduce la inicial del nombre de la pieza de ajedrez: ");
        piece = sc.nextLine();
        if (piece.equals("R")) { // Rey
            System.out.println("Puede moverse en todas direcciones pero solo una posición.");
        } else if (piece.equals("D")) { // Dama / Reina
            System.out.println("Puede moverse en cualquier dirección (horizontal, vertical o diagonal) cualquier número de casillas.");
        } else if (piece.equals("T")) { // Torre
            System.out.println("Se mueve en línea recta horizontal o vertical cualquier número de casillas.");
        } else if (piece.equals("A")) { // Alfil
            System.out.println("Se mueve en diagonal cualquier número de casillas.");
        } else if (piece.equals("C")) { // Caballo
            System.out.println("Se mueve en L: dos casillas en una dirección y una perpendicular; puede saltar piezas.");
        } else if (piece.equals("P")) { // Peón
            System.out.println("Avanza una casilla hacia delante (dos desde la posición inicial); captura en diagonal una casilla.");
        } else {
            System.out.println("Inicial no válida. Usa: R (Rey), D (Dama), T (Torre), A (Alfil), C (Caballo), P (Peón).");
        }
    }

}
