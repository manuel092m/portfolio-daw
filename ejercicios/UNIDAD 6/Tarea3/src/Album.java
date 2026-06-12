import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {

    private String nombre;
    private String artista;
    private ArrayList<Song> canciones;

    public Album(String nombre, String artista){
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = new ArrayList<>();
    }

    public Song findSong(String titulo){

        for (int i = 0; i < canciones.size(); i++){
            if (canciones.get(i).getTitulo().equals(titulo)){
                return canciones.get(i);
            }
        }
        return null;
    }

    public boolean addSong(String titulo, double duracion){
        if (findSong(titulo) == null){
            canciones.add(new Song(titulo,duracion));
            return true;
        }

        return false;
    }

    public boolean addToPlayList(int numeroLista, LinkedList<Song> playlist){

        int index = numeroLista - 1;

        if (index >0 && index < canciones.size()){
            playlist.add(canciones.get(index));
            return true;
        }
        return false;
    }


    public boolean addToPlayList(String titulo, LinkedList<Song> playList) {

        Song cancion = findSong(titulo);

        if (cancion != null) {
            playList.add(cancion);
            return true;
        }

        return false;
    }

    public static void printList(LinkedList<Song> playlist){
        Iterator<Song> it = playlist.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
