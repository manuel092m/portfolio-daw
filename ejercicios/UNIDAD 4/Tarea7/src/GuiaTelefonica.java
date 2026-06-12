public class GuiaTelefonica {

    private EntradaTelefono[] lista;

    public GuiaTelefonica(){

        lista = new EntradaTelefono[5];

        lista[0] = new EntradaTelefono("Patricia Marti", 123456789);
        lista[1] = new EntradaTelefono("Juan Lopez", 654321987);
        lista[2] = new EntradaTelefono("Ana Ruiz", 111222333);
        lista[3] = new EntradaTelefono("Carlos Perez", 444555666);
        lista[4] = new EntradaTelefono("Lucia Gomez", 777888999);

    }

    public EntradaTelefono buscar(String nombre){
        for (int i = 0;i< lista.length; i++){

            if (lista[i].getNombre().equals(nombre)){
                return lista[i];
            }
        }

        return null;
    }



}
