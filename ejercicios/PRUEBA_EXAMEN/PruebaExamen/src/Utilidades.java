public class Utilidades {
    public static double calcularMedia(int... puntos){
        int suma = 0;

        for (int p : puntos){
            suma = suma + p;
        }
        return (double) suma / puntos.length;
    }
}
