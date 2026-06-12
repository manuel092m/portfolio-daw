import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class analizadorNumeros {

    //Análisis y cálculos con numeros
    //Autor: Manuel De Los Reyes
    //Fecha: 21/11/2025
    //Finalidad: Analizar numeros

    public static boolean esPrimo(int n){

        return n % 7 == 0;
    }

    public static void main(String[] args) {

        //Declaración de Variables

        int num;
        int NUM_VALORES= 5;
        final int VALOR_MINIMO = 0;
        final int VALOR_MAXIMO = 100;
        int suma = 0;
        int numPares= 0;
        int numImpares= 0;
        int numMinimo = 100;
        int numMaximo = 0;

        //Bucle para pedir al ususario el valor junto a las condiciones para analizar los valores
        do {
            //Scaner para pedir valor
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un valor");
            num = sc.nextInt();
            suma = suma + num;
            //Si el valor es 0 deja de pedir datos
            if (num == 0){
                break;
            }
            //Recuento de numeros impares
            if (num % 2 !=0){
                numImpares = numImpares + 1;
            }

            //Recuento de numeros pares
            if (num % 2 ==0){
                numPares = numPares + 1;
            }

            if (num<numMinimo){  //Buscar el numero minimo
                numMinimo=num;
            }
            if (num>numMaximo){    //Buscar el numero maximo
                numMaximo=num;
            }

            NUM_VALORES = NUM_VALORES -1;
            if (NUM_VALORES ==0){
                break;
            }

        }while (num <= VALOR_MAXIMO && num >= VALOR_MINIMO);

        //Imprime resultados
        System.out.println("La suma es " +suma);
        System.out.println("Hay "+ numImpares+ " numeros impares");
        System.out.println("Hay "+ numPares+ " numeros pares");
        System.out.println("El numero minimo es "+ numMinimo);
        System.out.println("El numero maximo es "+ numMaximo);

        //Imprime si es primo o no
        System.out.println(esPrimo(7));


    }
}