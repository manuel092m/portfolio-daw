public class Suelo {
    private double ancho;
    private double largo;

    public Suelo(double ancho, double largo){
        if (ancho<0){
            this.ancho = 0;
        }else this.ancho = ancho;
        if (largo<0){
            this.largo = 0;
        }else this.largo = largo;
    }

    public double getArea(){
        return ancho * largo;
    }



}
