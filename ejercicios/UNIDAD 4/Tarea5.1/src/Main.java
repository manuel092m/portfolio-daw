public class Main {
    public static void main(String[] args){
        System.out.println("INGLES:");
        AnalizadorFrecuencias analizador = new AnalizadorFrecuencias();
        analizador.contarLetras("An algorithm is a set of instructions for solving logical and mathematical problems," +
                " or for accomplishing some other task. ");
        analizador.imprimirArray();

        System.out.println();
        System.out.println("ESPAÑOL");
        AnalizadorFrecuenciasCastellano a =
                new AnalizadorFrecuenciasCastellano();

        a.contarLetras("España es un país pequeño, pero muy bonito");
        a.imprimirArray();
    }
}


