package Impresora;

public class Impresora {

    private int nivelToner;
    private int paginasImpresas;
    private boolean dobleCara;

    public Impresora(int nivelToner, boolean dobleCara) {

        if (nivelToner >= 0 && nivelToner <= 100) {
            this.nivelToner = nivelToner;
        } else {
            this.nivelToner = 0;
        }

        this.paginasImpresas = 0;
        this.dobleCara = dobleCara;
    }

    public int añadirToner(int cantidad) {

        if (cantidad < 0 || cantidad > 100 || nivelToner + cantidad > 100) {
            return -1;
        }

        nivelToner += cantidad;
        return nivelToner;
    }
    public int imprimirPaginas(int paginas) {

        int hojasUsadas;

        if (dobleCara) {
            hojasUsadas = paginas / 2;

            if (paginas % 2 != 0) {
                hojasUsadas++;
            }
        } else {
            hojasUsadas = paginas;
        }

        paginasImpresas += hojasUsadas;

        return hojasUsadas;
    }

    public int getPaginasImpresas(){
        return paginasImpresas;
    }
}

