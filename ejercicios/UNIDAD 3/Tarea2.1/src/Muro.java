public class Muro {
    private double ancho;
    private double alto;

    public Muro(){
        this(0,0);
    }

    public Muro(double ancho, double alto) {

        if (ancho < 0) {
            this.ancho = 0;
        } else {
            this.ancho = ancho;
        }

        if (alto < 0) {
            this.alto = 0;
        } else {
            this.alto = alto;
        }
    }

    public double getAncho(){
        return ancho;
    }
    public double getAlto(){
        return alto;
    }

    public void setAncho(double ancho){
        if (ancho<0){
            this.ancho =0;
        }else {
            this.ancho = ancho;
        }
    }
    public void setAlto(double alto){
        if (alto<0){
            this.alto =0;
        }else {
            this.alto = alto;
        }
    }

    public double getArea(){
        return ancho * alto;
    }


}
