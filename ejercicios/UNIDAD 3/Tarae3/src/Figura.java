public class Figura {
    public static double area(double radio){
        double area = radio * radio * Math.PI;
        if (radio<0){
            return  -1;
        }else return area;
    }

    public static double area(double x, double y){
        double area = x * y;
        if (x<0 || y<0){
            return  -1;
        }else return area;
    }

    public static double area(int base, int altura){

        if (base <0 || altura <0){
            return -1;
        }else return (double) (base * altura)/2;
    }
}
