public class Song {
    private String titulo;
    private double duracion;

    public Song(String titulo, double duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String toString(){
        return titulo + ": " + duracion;
    }
}
