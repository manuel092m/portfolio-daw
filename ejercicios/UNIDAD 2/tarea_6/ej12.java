import java.util.Scanner;

public class ej12 {
    public static void run(Scanner sc) {

        String guess;

        for (guess = ""; !"Daffy Duck".equals(guess); ) {
            System.out.print("Guess my name: ");
            guess = sc.nextLine();


        }
        System.out.println("Congratulations, you guessed my name correctly!");
    }
}


