public class Spiderman extends Persona implements SuperHeroe {

    private String superPoder;

    public Spiderman(String nombre, int edad, String superPoder) {
        super(nombre, edad);
        this.superPoder = superPoder;
    }

    @Override
    public void activarSuperPoder() {
        System.out.println(nombre + " lanza telarañas: " + superPoder);
    }

    @Override
    public void desactivarSuperPoder() {
        System.out.println(nombre + " deja de usar sus poderes");
    }
}