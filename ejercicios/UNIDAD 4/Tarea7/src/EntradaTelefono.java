public class EntradaTelefono {

    private String nombre;
    private int numero;

    public EntradaTelefono(String nombre, int telefono) {
        this.nombre = nombre;
        this.numero = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }
}
