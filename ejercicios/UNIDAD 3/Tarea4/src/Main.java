public class Main {

    //1.
    public static char buscarCaracter(String texto, int indice){
        return texto.charAt(indice);
    }

    //2.
    public static int unicodePoint(String texto, int indice){

        return texto.codePointAt(indice - 1);
    }

    //3.
    public static boolean igualTexto(String string1, String string2) {
        return string1.equals(string2);
    }

    //4.
    public static boolean igualTextoIgnore(String string1, String string2) {

        return string1.equalsIgnoreCase(string2);
    }

    //5.
    public static String compareToLexico(String string1, String string2) {

        if (string1.compareTo(string2) == 0){
            return "Son iguales";
        }
        else if (string1.compareTo(string2) > 0){
            return string1 + " es mayor que " + string2;
        }
        else {
            return string1 + " es menor que " + string2;
        }

    }

    //6.
    public static String compareToLexicoIgnore(String string1, String string2) {

        if (string1.compareToIgnoreCase(string2) == 0){
            return "Son iguales";
        }
        else if (string1.compareToIgnoreCase(string2) > 0){
            return string1 + " es mayor que " + string2;
        }
        else {
            return string1 + " es menor que " + string2;
        }

    }
    //7.
    public static boolean containPalabra(String texto1, String texto2) {

        return texto1.toLowerCase().contains(texto2.toLowerCase());
    }

    //8.
    public static boolean empiezaPor(String texto1, String texto2) {

        return texto1.startsWith(texto2);
    }
    //9.
    public static void bucleIndice(String texto) {

        for (int i = 0; i <texto.length(); i++){
            System.out.println("   "+ texto.charAt(i) + " indice "+ i);
        }

    }

    //10.
    public static String reemplazarCaracter(String texto, char antiguo, char nuevo) {

        return texto.replace(antiguo, nuevo);
    }

    //11.
    public static String eliminarCaracter(String texto, int posicion) {

        return texto.substring(0,posicion) + texto.substring(posicion + 1);
    }

    //12.
    public static String revertirTexto(String texto) {

        String resultado = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }

        return resultado;
    }

    //13.
    public static String obtenerSubtexto(String texto, int posInicio, int posFin) {
        return texto.substring(posInicio, posFin + 1);
    }

    //14
    public static String sinDuplicados(String texto) {
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (!resultado.contains(String.valueOf(c))) {
                resultado = resultado + c;
            }
        }

        return resultado;
    }

    //15

    public static char primerNoRepetido(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (texto.indexOf(c) == texto.lastIndexOf(c)) {
                return c;
            }
        }
        return '\0';
    }

    //16
    public static void divisionString(String texto, int partes) {
            if (texto.length() % partes ==0){
                System.out.println("El texto no es divisible");
                return;
            }
            int tamañoParte = texto.length() / partes;

            for (int i = 0 ; i< texto.length(); i= i + tamañoParte){
            System.out.println(texto.substring(i, i + tamañoParte));
        }

    }

    public static void main(String[] args){

        System.out.println("1. " + buscarCaracter("HOLA", 1));
        System.out.println("2. " + unicodePoint("ADIOS", 2));
        System.out.println("3. " + igualTexto("Me voy a ir", "ME VOY A IR"));
        System.out.println("4. " + igualTextoIgnore("Me voy a ir", "ME VOY A IR"));
        System.out.println("5. " + compareToLexico("muchos caracteres", "pocos"));
        System.out.println("6. " + compareToLexicoIgnore("SI", "si"));
        System.out.println("7. " + containPalabra("Hola Mundo", "mundo"));
        System.out.println("8. " + empiezaPor("Hola Mundo", "Hola"));
        System.out.println("9. "); bucleIndice("CUBO");
        System.out.println("10. " + reemplazarCaracter("Topa", 'o', 'a'));
        System.out.println("11. " + eliminarCaracter("Primo", 1));
        System.out.println("12. " + revertirTexto("OJA"));
        System.out.println("13. " + obtenerSubtexto("Hoy estamos acaloraos", 0, 2));
        System.out.println("14. " + sinDuplicados("Holografico"));
        System.out.println("15. " + primerNoRepetido("AABBCDDEE"));
        System.out.println("16. "); divisionString("AAABBBCCCDDD", 5);










    }
}