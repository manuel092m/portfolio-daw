public class FrecuenciaLetra {

    private char letra;
    private int frecuencia;

    public FrecuenciaLetra(char letra) {
        this.letra = letra;
        this.frecuencia = 0;
    }

    public char getLetra() {
        return letra;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void incrementarFrecuencia(){
        frecuencia++;
    }
}
