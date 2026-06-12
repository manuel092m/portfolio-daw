public class Char implements CharSequence {

    protected char[] cadena;

    public Char(char[] cadena) {
        this.cadena = cadena;
    }

    @Override
    public int length() {
        return cadena.length;
    }

    @Override
    public char charAt(int index) {
        return cadena[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String resultado = "";

        for (int i = end - 1; i >= start; i--) {
            resultado += cadena[i];
        }

        return resultado;
    }

    @Override
    public String toString() {
        return new String(cadena);
    }
}