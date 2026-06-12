public class MinutosSegundos {
    public static String obtenerMensajeDuracion(int minutos, int segundos) {

        if (minutos < 0 || segundos < 0 || segundos > 59) {
            return "Valor inválido";
        }

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        return horas + "h " + minutosRestantes + "m " + segundos + "s";
    }

    public static String obtenerMensajeDuracion(int segundos) {

        if (segundos < 0) {
            return "Valor inválido";
        }

        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;

        return obtenerMensajeDuracion(minutos, segundosRestantes);
    }


}
