
public class Forma {
    protected String nombre;

    public Forma(String nombre){
        this.nombre = nombre;
    }
    public double area(){
        return 0;
    }

    public String toString(){
        return nombre;
    }
}

class Esfera extends Forma{

    private double radio;

    public Esfera(double radio){
        super("Esfera");
        this.radio = radio;
    }
    public double area(){
        return 4 * Math.PI * radio * radio;
    }

}
class Rectangulo extends Forma{
    private int longitud;
    private int ancho;

    public Rectangulo(int longitud, int ancho){
        super("Rectangulo");
        this.longitud = longitud;
        this.ancho = ancho;
    }
    public double area(){
        return longitud * ancho;
    }
}
class Cilindro extends Forma{
    private double radio;
    private int altura;

    public Cilindro(double radio, int altura){
        super("Cilindro");
        this.radio = radio;
        this.altura = altura;
    }
    public double area(){
        return Math.PI *(radio * radio) *altura;
    }
}

class Pintura{
    protected double cobertura;

    public Pintura(double cobertura){
        this.cobertura = cobertura;
    }

    public double pinturaNecesaria(Forma f){
        return f.area() / cobertura;
    }
}

class MainPintura {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);

        Forma rect = new Rectangulo(20, 35);
        Forma esf = new Esfera(15);
        Forma cil = new Cilindro(10, 30);

        System.out.println("Rectángulo: " + pintura.pinturaNecesaria(rect));
        System.out.println("Esfera: " + pintura.pinturaNecesaria(esf));
        System.out.println("Cilindro: " + pintura.pinturaNecesaria(cil));

    }
}



