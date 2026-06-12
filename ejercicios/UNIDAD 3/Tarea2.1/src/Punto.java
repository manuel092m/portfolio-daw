public class Punto {
    private int x;
    private int y;

    public Punto(){
        this(0,0);
    }
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public double distancia() {
        return Math.sqrt((x * x) + (y * y));
    }


    public double distancia(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }


    public double distancia(Punto otro) {
        int dx = this.x - otro.x;
        int dy = this.y - otro.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }
}
