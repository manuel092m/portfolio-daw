public class Batman extends Persona implements SuperHeroe {
    protected String superPoder;

    public Batman(String nombre, int edad, String superPoder) {
        super(nombre, edad);
        this.superPoder = superPoder;
    }

    public void activarSuperPoder() {
        System.out.println(nombre + " activa su poder: " + superPoder);
    }

    public void desactivarSuperPoder() {
        System.out.println(nombre + " desactiva su poder");
    }
}
