public class Cubo {
    private int lado;

    public Cubo(int lado) {
        this.lado = lado;
    }

    public int area(){
        return 6 * lado * lado;
    }

    public int volumen(){
        return lado * lado *lado;
    }


}