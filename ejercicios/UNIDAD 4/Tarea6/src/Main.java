public class Main {

    public static int promedioVentas(int[][] matriz) {
        int totalventas = 0;
        int semanas = matriz.length;
        int dias = matriz[0].length;

        for (int i = 0; i < semanas; i++) {
            for (int j = 0; j < dias; j++) {
                totalventas = totalventas + matriz[i][j];
            }

        }
        return totalventas / semanas;
    }

    public static int promedioDomingos(int[][] matriz) {
        int suma = 0;
        int semanas = matriz.length;

        for (int i = 0; i < semanas; i++) {
            suma += matriz[i][6]; // domingo
        }

        return suma / semanas;
    }


    public static void main(String[] args){

        int[][] matriz = new int[52][7];

        matriz[0][6] = 20;
        matriz[1][6] = 15;
        matriz[2][6] = 18;

        //System.out.println(promedioVentas(matriz));
        System.out.println(promedioDomingos(matriz));

    }
}