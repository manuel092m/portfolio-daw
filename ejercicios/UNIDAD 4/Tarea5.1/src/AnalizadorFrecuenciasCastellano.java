public class AnalizadorFrecuenciasCastellano {

    FrecuenciaLetra[] frecuencias;
    String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

    public AnalizadorFrecuenciasCastellano() {

        frecuencias = new FrecuenciaLetra[27];

        for (int i = 0; i < alfabeto.length(); i++) {
            frecuencias[i] = new FrecuenciaLetra(alfabeto.charAt(i));
        }
    }

    public void contarLetras(String texto) {

        texto = texto.toUpperCase();

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);
            int posicion = alfabeto.indexOf(letra);

            if (posicion != -1) {
                frecuencias[posicion].incrementarFrecuencia();
            }
        }
    }

    public void imprimirArray() {

        for (int i = 0; i < frecuencias.length; i++) {
            System.out.println(
                    "letra: " + frecuencias[i].getLetra() +
                            " frecuencia: " + frecuencias[i].getFrecuencia()
            );
        }
    }
}
