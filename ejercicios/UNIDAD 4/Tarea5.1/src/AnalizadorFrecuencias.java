public class AnalizadorFrecuencias {

    private FrecuenciaLetra[] frecuencias;

    public AnalizadorFrecuencias() {

        frecuencias = new FrecuenciaLetra[26];

        for (int i = 0; i < 26; i++) {
            frecuencias[i] = new FrecuenciaLetra((char) ('A' + i));
        }
    }

    public void contarLetras(String texto){

        texto = texto.toUpperCase();

        for (int i = 0; i < texto.length(); i++){

            char letra = texto.charAt(i);

            if (letra >= 'A' && letra <= 'Z'){
                int posicion = letra -'A';
                frecuencias[posicion].incrementarFrecuencia();
            }
        }
    }

    public void imprimirArray(){
        for (int i = 0; i< frecuencias.length; i++){
            System.out.println("Letra: " + frecuencias[i].getLetra() +
                                " frecuencia: " + frecuencias[i].getFrecuencia());
        }
    }




}
