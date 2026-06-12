public class Jugador extends Participante {

    private String nombre;
    private String nickname;
    private int edad;
    private int puntuacion;
    private Categoria categoria;

    public Jugador(String nombre, String nickname, int edad, int puntuacion, Categoria categoria) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.edad = edad;
        this.puntuacion = puntuacion;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Nickname: "+ nickname);
        System.out.println("Edad: "+ edad);
        System.out.println("Puntuación: "+ puntuacion);
    }

    public void sumarPuntos(int puntos){
        puntuacion = puntuacion + puntos;
    }
    public void sumarPuntos(int puntos, int bonus){
        puntuacion = puntos + bonus;
    }

    @Override
    public void jugar() {
        System.out.println("El jugador esta jugando");
    }
}
