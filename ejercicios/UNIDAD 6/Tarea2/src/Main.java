import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static TelefonoMovil telefono = new TelefonoMovil("600000000");

    public static void main(String[] args) {

        boolean salir = false;
        printMenu();

        while (!salir) {

            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 0:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;

                case 1:
                    telefono.printContacts();
                    break;

                case 2:
                    addContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printMenu();
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }
    }


    public static void printMenu() {
        System.out.println("\nMenú:");
        System.out.println("0 - Salir");
        System.out.println("1 - Imprimir contactos");
        System.out.println("2 - Añadir contacto");
        System.out.println("3 - Actualizar contacto");
        System.out.println("4 - Eliminar contacto");
        System.out.println("5 - Buscar contacto");
        System.out.println("6 - Mostrar menú");
    }


    public static void addContact() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Teléfono: ");
        String telefonoNum = sc.nextLine();

        Contacto nuevo = Contacto.createContact(nombre, telefonoNum);

        if (telefono.addNewContact(nuevo)) {
            System.out.println("Contacto añadido correctamente");
        } else {
            System.out.println("Error: el contacto ya existe");
        }
    }


    public static void updateContact() {
        System.out.print("Nombre del contacto a actualizar: ");
        String nombre = sc.nextLine();

        Contacto existente = telefono.queryContact(nombre);

        if (existente == null) {
            System.out.println("El contacto no existe");
            return;
        }

        System.out.print("Nuevo nombre: ");
        String nuevoNombre = sc.nextLine();

        System.out.print("Nuevo teléfono: ");
        String nuevoTelefono = sc.nextLine();

        Contacto nuevo = Contacto.createContact(nuevoNombre, nuevoTelefono);

        if (telefono.updateContact(existente, nuevo)) {
            System.out.println("Contacto actualizado correctamente");
        } else {
            System.out.println("Error al actualizar (puede que ya exista)");
        }
    }


    public static void removeContact() {
        System.out.print("Nombre del contacto a eliminar: ");
        String nombre = sc.nextLine();

        Contacto existente = telefono.queryContact(nombre);

        if (existente == null) {
            System.out.println("El contacto no existe");
            return;
        }

        if (telefono.removeContact(existente)) {
            System.out.println("Contacto eliminado correctamente");
        } else {
            System.out.println("Error al eliminar");
        }
    }


    public static void queryContact() {
        System.out.print("Nombre a buscar: ");
        String nombre = sc.nextLine();

        Contacto c = telefono.queryContact(nombre);

        if (c == null) {
            System.out.println("No encontrado");
        } else {
            System.out.println("Nombre: " + c.getName());
            System.out.println("Teléfono: " + c.getPhoneNumber());
        }
    }
}