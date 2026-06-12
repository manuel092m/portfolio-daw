import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Torneo torneoprueba = new Torneo();
        int[][] puntuaciones = new int[3][3];

        puntuaciones[0][0] = 10;
        puntuaciones[0][1] = 20;
        puntuaciones[0][2] = 30;

        puntuaciones[1][0] = 15;
        puntuaciones[1][1] = 25;
        puntuaciones[1][2] = 35;

        puntuaciones[2][0] = 5;
        puntuaciones[2][1] = 10;
        puntuaciones[2][2] = 15;

        for (int i = 0; i < puntuaciones.length; i++){
            int suma = 0;

            for (int j=0; j<puntuaciones[i].length; j++){
                suma = suma + puntuaciones[i][j];
            }

            double media = (double) suma / puntuaciones[i].length;
            System.out.println("Media jugador " + i +": " + media);
        }

        /*try {

            torneoprueba.validarNickname("ab");

        }
        catch(NicknameInvalidoException e) {

            System.out.println(e.getMessage());
        }

        try {
            Jugador j = torneoprueba.buscarJugador("Manu");
            if (j==null){
                throw new Exception("Jugador no encontrado");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            int[] numeros = new int[3];
            System.out.println(numeros[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posicion fuera del array");
        }


        ArrayList<Jugador> jugadores = new ArrayList<>();

        Jugador j1 = new Jugador(
                "Manuel",
                "ManuPro",
                20,
                150,
                Categoria.ORO
        );

        Jugador j2 = new Jugador(
                "Ana",
                "AnaKill",
                19,
                220,
                Categoria.DIAMANTE
        );

        Jugador j3 = new Jugador(
                "Luis",
                "LuisGG",
                21,
                90,
                Categoria.PLATA
        );

        Jugador j4 = new Jugador(
                "Carlos",
                "Carlitos",
                18,
                300,
                Categoria.DIAMANTE
        );*/

        // MENU

        Scanner sc = new Scanner(System.in);
        Torneo torneo = new Torneo();
        int opcion;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Crear jugador");
            System.out.println("2. Registrar partida");
            System.out.println("3. Mostrar ranking");
            System.out.println("4. Buscar jugador");
            System.out.println("5. Mostrar historial");
            System.out.println("6. Salir");

            opcion =sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:

                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();

                    System.out.println("Nickname:");
                    String nickname = sc.nextLine();

                    System.out.println("Edad:");
                    int edad = sc.nextInt();

                    System.out.println("Puntuacion:");
                    int puntuacion = sc.nextInt();
                    sc.nextLine();

                    Jugador j = new Jugador(nombre,nickname,edad,puntuacion,Categoria.ORO);
                    torneo.añadirJugador(j);
                    break;


                case 2:
                    System.out.println("Nickname jugador:");
                    String nickPartida = sc.nextLine();
                    Jugador jugadorPartida = torneo.buscarJugador(nickPartida);

                    if (jugadorPartida != null) {
                        System.out.println("Descripcion partida:");
                        String partida = sc.nextLine();
                        torneo.registrarPartida(jugadorPartida, partida);
                    }else {
                        System.out.println("Jugador no encontrado");
                    }
                    break;


                case 3:
                    torneo.ordenarJugadores();
                    break;
                case 4:

                    System.out.println("Nickname:");
                    String nickBuscar = sc.nextLine();

                    Jugador encontrado = torneo.buscarJugador(nickBuscar);
                    if (encontrado != null) {
                        encontrado.mostrarInfo();
                    }else{
                        System.out.println("Jugador no encontrado");
                    }
                    break;


                case 5:
                    System.out.println("Nickname:");
                    String nickHistorial = sc.nextLine();

                    Jugador jugadorHistorial = torneo.buscarJugador(nickHistorial);

                    if (jugadorHistorial != null) {
                        torneo.mostrarHistorial(jugadorHistorial);
                    }else {
                        System.out.println("Jugador no encontrado");
                    }

                    break;


                case 6:
                    System.out.println("Saliendo");

                    break;


                default:
                    System.out.println("Opcion incorrecta");

            }

        } while(opcion != 6);

        sc.close();
            }
        }