

/*public class main {

    public static void mostrarPosicionRankinPuntuaciones(String jugador, int posicion){

        System.out.println(jugador + " consiguió llegar a la posición " + posicion + " en el ranking de puntuaciones.");

    }
    public static int calcularPosicionRankingPuntuaciones(int puntuacion){

        int posicion = 4;
        if (puntuacion > 1000) {
            posicion = 1;
        }
        if (puntuacion > 500) {
            posicion = 2;
        }
        if (puntuacion > 100) {
            posicion = 3;
        }
        return posicion;
    }




    public static void main(String[] args) {

        int posicion = calcularPosicionRankingPuntuaciones(30);
        mostrarPosicionRankinPuntuaciones("Manuel", posicion);


    }
}*/



/*public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            long millasPorHora = Math.round(kilometersPerHour /1.609);
            return millasPorHora;
        }

    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Valor inválido");
        } else {
            long millasPorHora = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + millasPorHora + " mi/h");
        }
    }


    public static void main(String[] args) {

        toMilesPerHour(1.5);
        printConversion(150);

    }
} */



/*public class Despertar {

    public static boolean hayQueDespertarse(boolean ladrido,int horaDelDía){
        if (ladrido&& (horaDelDía < 8 || horaDelDía > 22)) {
            return true;
        }
        if (horaDelDía < 0 || horaDelDía > 23)   {
            return false;
        }

        else return false;
    }

    public static void main(String[] args) {

        hayQueDespertarse(true, 1);

    }
} */

public class KilometrosAMetros {

    public static long KilometrosAMetros(int metros) {

        long kilometrosConversion = Math.round(metros * 1000);

        return kilometrosConversion;

    }

    public static void escribirConversion(int metros) {

        if(metros< 1)
        {
            System.out.println("Incrementa la cantidad");
        } else System.out.println(metros +"km son "+KilometrosAMetros(metros) + "m");
    }

    public static void main(String[] args) {

        escribirConversion(15);

    }


}


