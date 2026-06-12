import java.util.Scanner;

public class main {

    /*public static void imprimeNumeroEnLetra(int numero){

        switch (numero){
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            default:
                System.out.println("OTRO");
                break;
        }
    }

      public static boolean esImpar(int numero){

        while (numero<0){
            return false;
        }

        if (numero % 2 !=0){
            return true;
        }else{
            return false;
        }
    }

    public static int sumarImpares(int inicio, int fin){

        if (inicio <= 0 || fin <= 0 || fin < inicio) {
            return -1;
        }

        int suma = 0;

        for (int i = inicio; i <= fin; i++) {
            if (esImpar(i)) {
                suma = suma +i;
            }
        }

        return suma;
    }



    public static void imprimirFactores(int n){
        if (n<1){
            System.out.println("Valor Inválido");
        }

        for (int i =1;i<=n;i++){

            if(n % i== 0){
                System.out.println(i);
            }
        }

    }



    public static boolean esPalindromo(int n){

        int numeroOriginal = n;
        int reverso = 0;

        while (n != 0) {
            int ultimoDigito = n % 10;
            reverso = reverso * 10;
            reverso += ultimoDigito;
            n = n / 10;
        }

        return numeroOriginal == reverso;
    }

*/
    public static void insertaImprimeSumaYMedia() {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        while (true) {  // bucle infinito

            if (sc.hasNextInt()) {   // Si lo que inserta es un número
                int numero = sc.nextInt();
                suma += numero;
                contador++;
            } else {                 // Si NO es un número → salimos del bucle
                break;
            }
        }

        if (contador == 0) {  // Si no se introdujo ningún número válido
            System.out.println("SUM = 0 AVG = 0");
        } else {
            long media = Math.round((double) suma / contador);
            System.out.println("SUM = " + suma + " AVG = " + media);
        }
    }

    public static void main(String[] args) {

        //imprimeNumeroEnLetra(8);
        //System.out.println(sumarImpares(1,100));
        //System.out.println(sumarImpares(3,200));
        //imprimirFactores(20);
        //System.out.println(esPalindromo(12321));

        insertaImprimeSumaYMedia();



    }
}