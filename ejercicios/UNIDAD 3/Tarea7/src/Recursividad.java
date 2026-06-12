public class Recursividad {

    public static int sumaDigitos(int num) {

        if (num<=10){
            return num;
        }

        return (num %10) + sumaDigitos(num /10);


    }

    public static int Factorial(int num) {

        if (num == 1){
            return 1;
        }

        return (num +1) * Factorial(num -1);


    }

    public static boolean esPalindromo(String cadena){
        if (cadena.length()<=1) return true;
        if (cadena.charAt(0) == cadena.charAt(cadena.length()-1))
            return esPalindromo(cadena.substring(1,cadena.length()-1));
        return false;

    }


    public static void main(String[] args) {

        //System.out.println(sumaDigitos(514));
        //System.out.println(Factorial(5));
        System.out.println(esPalindromo("popop"));

    }
}