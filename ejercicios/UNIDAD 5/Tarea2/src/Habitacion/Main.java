package Habitacion;

public class Main {
    public static void main(String[] args){


        Cama cama = new Cama("Antiguo",2,1,3,1);
        Lampara lampara = new Lampara("Moderna", true, 8);
        Pared pared1 = new Pared("izquierda");
        Pared pared2= new Pared("frente");
        Pared pared3 = new Pared("derecha");
        Pared pared4 = new Pared("detras");
        Techo techo = new Techo(1, 3);

        Habitacion habitacion = new Habitacion("Cuarto", pared1, pared2, pared3, pared4, techo, cama, lampara);

        habitacion.hacerLaCama();
        habitacion.getLampara().encender();
    }
}