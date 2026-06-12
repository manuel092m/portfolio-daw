public class Pelicula extends Video {

    private String director;
    private double valoracion;

    public Pelicula(String titulo, int minutos, String director, double valoracion){
        super(titulo,minutos);
        this.director = director;
        this.valoracion = valoracion;
    }

}