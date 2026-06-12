public class Main {
    public static void main(String[] args) {


        System.out.println(MinutosSegundos.obtenerMensajeDuracion(125, 30));
        System.out.println(MinutosSegundos.obtenerMensajeDuracion(61, 0));
        System.out.println(MinutosSegundos.obtenerMensajeDuracion(-5, 10));


        System.out.println(MinutosSegundos.obtenerMensajeDuracion(3661));
        System.out.println(MinutosSegundos.obtenerMensajeDuracion(3600));
        System.out.println(MinutosSegundos.obtenerMensajeDuracion(-10));

        System.out.println();

        System.out.println(Figura.area (5.0));
        System.out.println(Figura.area (-1));
        System.out.println(Figura.area (5.0, 4.0));
        System.out.println(Figura.area (-1.0, 4.0));

        System.out.println();

        System.out.println(Figura.area(3, 3));
        System.out.println(Figura.area(4, 2));
        System.out.println(Figura.area(-3, 5));



    }
}