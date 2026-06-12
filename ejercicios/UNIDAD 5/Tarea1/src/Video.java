class Video {
    protected String titulo;
    protected int minutos;

    public Video(String titulo, int minutos) {
        this.titulo = titulo;
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "Video{titulo='" + titulo + "', minutos=" + minutos + "}";
    }
}