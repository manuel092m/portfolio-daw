public class MainHero {
    public static void main(String[] args) {

        Batman b = new Batman("Bruce Wayne", 40, "Inteligencia y gadgets");
        Spiderman s = new Spiderman("Peter Parker", 18, "Telarañas");

        b.activarSuperPoder();
        b.desactivarSuperPoder();

        s.activarSuperPoder();
        s.desactivarSuperPoder();
    }
}