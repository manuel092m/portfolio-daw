public class Main {

    public static void main(String[] args) {

        GuiaTelefonica guia = new GuiaTelefonica();

        EntradaTelefono resultado = guia.buscar("Patricia Marti");

        if (resultado != null) {
            System.out.println("Encontrado: " + resultado.getNombre() +
                    " - Telefono: " + resultado.getNumero());
        } else {
            System.out.println("No encontrado en la guia");
        }
    }
}