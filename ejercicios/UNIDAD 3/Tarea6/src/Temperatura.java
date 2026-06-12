public class Temperatura {

    public static String conversion(double celsius, double fahrenheit){

        double celsiusPaFaren = (9.0/5.0*celsius)+32;
        double farenPaCelsius = (5.0/9.0)*(fahrenheit-32);

        return celsiusPaFaren + " grados fahrenheit "+ farenPaCelsius + " grados celsius";

    }
}
