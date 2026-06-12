package Figuras;

public class Cilindro extends Circulo {
    protected double altura;
    public Cilindro(double altura, double radio){
        super(radio);
        if (altura<0){
            this.altura = 0;
        }else
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }


    public double getVolume(){
        return getArea() * altura;
    }
}
