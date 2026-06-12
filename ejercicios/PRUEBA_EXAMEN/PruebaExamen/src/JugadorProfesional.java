public class JugadorProfesional extends Jugador{

    private String equipo;

    public JugadorProfesional(String nombre, String nickname, int edad, int puntuacion, String equipo, Categoria categoria){
        super(nombre, nickname, edad, puntuacion, categoria);
        this.equipo = equipo;
    }

    @Override
    public void jugar() {
        System.out.println("Jugador profesional jugando en "+ equipo);
    }
}
