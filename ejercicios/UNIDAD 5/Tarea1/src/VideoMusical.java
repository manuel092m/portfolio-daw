public class VideoMusical extends Video{

    private String artista;
    private String categoria;

    public VideoMusical(String artista, String categoria, String titulo, int minutos){
        super(titulo, minutos);
        this.artista = artista;
        this.categoria = categoria;
    }

    @Override
    public String toString(){
        return "VideoMusical{titulo='" + titulo + "', minutos=" + minutos +
                ", artista='" + artista + "', categoria='" + categoria + "'}";
    }
}
