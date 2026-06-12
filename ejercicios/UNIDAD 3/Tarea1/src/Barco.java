public class Barco {

    private String nombreBarco;
    private int numPasajeros;
    private double velMaxima;

    public String getNombreBarco() {
        return nombreBarco;
    }

    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public double getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(double velMaxima) {
        this.velMaxima = velMaxima;
    }

    public String nombrePredeterminado() {
        if (numPasajeros > 1000) {
            return "Juana";
        }
        return "Luna";
    }

    public double limiteVel() {
        if (numPasajeros > 5000) {
            return 150;
        }
        return 200;
    }


}
