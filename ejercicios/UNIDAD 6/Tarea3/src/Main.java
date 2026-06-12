import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<>();

        Album album1 = new Album("Un Verano Sin Ti", "Bad Bunny");
        album1.addSong("Moscow Mule", 4.05);
        album1.addSong("Tití Me Preguntó", 4.03);

        Album album2 = new Album("Divide", "Ed Sheeran");
        album2.addSong("Shape of You", 3.53);
        album2.addSong("Perfect", 4.23);

        albums.add(album1);
        albums.add(album2);

        LinkedList<Song> playList = new LinkedList<>();

       
        album1.addToPlayList(1, playList);
        album1.addToPlayList(2, playList);


        album2.addToPlayList("Perfect", playList);

        play(playList);
    }


    public static void printList(LinkedList<Song> playList) {
        Iterator<Song> it = playList.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // iv. menú
    public static void menu() {
        System.out.println("0 - Salir");
        System.out.println("1 - Siguiente canción");
        System.out.println("2 - Canción anterior");
        System.out.println("3 - Repetir canción");
        System.out.println("4 - Mostrar playlist");
        System.out.println("5 - Mostrar menú");
    }

    // v. método play
    public static void play(LinkedList<Song> playList) {

        Scanner sc = new Scanner(System.in);
        ListIterator<Song> it = playList.listIterator();

        boolean salir = false;
        boolean haciaAdelante = true;

        if (playList.size() == 0) {
            System.out.println("Lista vacía");
            return;
        } else {
            System.out.println("Reproduciendo: " + it.next());
        }

        menu();

        while (!salir) {

            int opcion = sc.nextInt();

            switch (opcion) {

                case 0:
                    salir = true;
                    break;

                case 1:
                    if (!haciaAdelante) {
                        if (it.hasNext()) it.next();
                        haciaAdelante = true;
                    }

                    if (it.hasNext()) {
                        System.out.println("Reproduciendo: " + it.next());
                    } else {
                        System.out.println("Fin de la lista");
                        haciaAdelante = false;
                    }
                    break;

                case 2:
                    if (haciaAdelante) {
                        if (it.hasPrevious()) it.previous();
                        haciaAdelante = false;
                    }

                    if (it.hasPrevious()) {
                        System.out.println("Reproduciendo: " + it.previous());
                    } else {
                        System.out.println("Inicio de la lista");
                        haciaAdelante = true;
                    }
                    break;

                case 3:
                    if (haciaAdelante) {
                        if (it.hasPrevious()) {
                            System.out.println("Repitiendo: " + it.previous());
                            haciaAdelante = false;
                        }
                    } else {
                        if (it.hasNext()) {
                            System.out.println("Repitiendo: " + it.next());
                            haciaAdelante = true;
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;

                case 5:
                    menu();
                    break;
            }
        }
    }
}