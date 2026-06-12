public class Main {

    public static void main(String[] args) {


        Calculadora calculator = new Calculadora ();
        calculator.setPrimerNumero(5.0);
        calculator.setSegundoNumero(4);
        System.out.println("suma= " + calculator.getResultadoSuma());
        System.out.println("resta= " + calculator. getResultadoResta ());
        calculator.setPrimerNumero(5.25);
        calculator.setSegundoNumero(0);
        System.out.println("multiplicación= " +
                calculator.getMultiplicationResult());
        System.out.println("división= " + calculator.getDivisionResult());

        System.out.println();

        Persona persona = new Persona();
        persona.setNombre("");
        persona.setApellido("");
        persona.setEdad(10);
        System.out.println("fullName= " + persona.getFullName());
        System.out.println("adolescente= " + persona.esAdolescente());
        persona.setNombre("Patri");
        persona.setEdad(18);
        System.out.println("fullName= " + persona.getFullName());
        System.out.println("adolescente = " + persona. esAdolescente ());
        persona.setApellido("Guerrero");
        System.out.println("fullName= " + persona.getFullName());

        System.out.println();


        Barco barco1 = new Barco();
        barco1.setNombreBarco("Poseidón");
        barco1.setNumPasajeros(1200);
        barco1.setVelMaxima(180);

        System.out.println("Nombre del barco: " + barco1.getNombreBarco());
        System.out.println("Número de pasajeros: " + barco1.getNumPasajeros());
        System.out.println("Velocidad máxima: " + barco1.getVelMaxima());

        System.out.println("Nombre predeterminado: " + barco1.nombrePredeterminado());
        System.out.println("Límite de velocidad según pasajeros: " + barco1.limiteVel());
    }
}