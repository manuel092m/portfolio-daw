class NumberCruncher {
    private int num;
    public NumberCruncher (int num){
        this.num = num;
    }
    public int getNum() {
        return num;
    }

    public int dobleNum() {
        return num * 2;
    }

    public int tripleNum() {
        return num * 3;
    }

    public int cuadradoNum() {
        return num * num;
    }

    public int cuboNum() {
        return num * num * num;
    }
}

public class Main {
    public static void main(String[] args){

        NumberCruncher numero = new NumberCruncher(5);

        System.out.println(numero.getNum());
        System.out.println(numero.dobleNum());
        System.out.println(numero.tripleNum());
        System.out.println(numero.cuadradoNum());
        System.out.println(numero.cuboNum());

        System.out.println();

        Cubo c = new Cubo(2);

        System.out.println(c.area());
        System.out.println(c.volumen());



    }
}
