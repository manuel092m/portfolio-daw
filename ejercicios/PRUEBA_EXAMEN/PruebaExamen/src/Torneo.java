import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Torneo implements Clasificable{
    private ArrayList<Jugador> jugadores;
    private HashSet<String> nicknames;
    HashMap<Jugador, ArrayList<String>> historial;


    public Torneo() {
        jugadores = new ArrayList<>();
        nicknames = new HashSet<>();
        historial = new HashMap<>();
    }

    public void añadirJugador(Jugador jugador){
        if (nicknames.contains(jugador.getNickname())){
            System.out.println("Nickname duplicado");
        }else{
            jugadores.add(jugador);
            nicknames.add(jugador.getNickname());
            historial.put(jugador, new ArrayList<String>());
            System.out.println("Jugador añadido");
        }
    }

    public void registrarPartida(Jugador jugador, String partida){
        historial.get(jugador).add(partida);
    }

    public void mostrarHistorial(Jugador jugador){

        ArrayList<String> partidas = historial.get(jugador);
        Iterator<String> it = partidas.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


    public void validarNickname(String nickname) throws NicknameInvalidoException{
        if (nickname.isEmpty()){
            throw new NicknameInvalidoException("Nickname vacío");
        }
        if (nickname.length() < 4){
            throw new NicknameInvalidoException("Mínimo 4 caracteres");
        }
    }

    public void calcularRanking(){
            Jugador[] ranking = new Jugador[jugadores.size()];

            for (int i = 0; i < jugadores.size(); i++){
                ranking[i] = jugadores.get(i);
            }

            for(int i = 0; i < ranking.length - 1; i++) {

                for (int j = 0; j < ranking.length - 1 - i; j++) {

                    if (ranking[j].getPuntuacion() < ranking[j + 1].getPuntuacion()) {

                        Jugador aux = ranking[j];

                        ranking[j] = ranking[j + 1];

                        ranking[j + 1] = aux;
                    }
                }
            }

            for (Jugador j : jugadores){
                j.mostrarInfo();
            }
        }

        public Jugador buscarJugador(String nickname){
            for (Jugador j : jugadores){
                if (j.getNickname().equalsIgnoreCase(nickname)){
                    return j;
                }
            }
            return null;

    }

    public void mostrarJugadores(){
        Iterator<Jugador> it = jugadores.iterator();
        while (it.hasNext()){
            it.next().mostrarInfo();
        }
    }

    public void ordenarJugadores(){
        jugadores.sort((a,b) -> b.getPuntuacion() - a.getPuntuacion());
        for (Jugador j : jugadores){
            j.mostrarInfo();
        }
    }
}


