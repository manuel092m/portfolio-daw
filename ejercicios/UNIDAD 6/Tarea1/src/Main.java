import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DonationData data = new DonationData();
        data.donationDataInit();

        // a) Añadir 4 donaciones
        data.donationDataAdd(data.donationParse("15/04/2023;12345678N;ACN;ACN8455;15.50"));
        data.donationDataAdd(data.donationParse("16/04/2023;11111111A;CRZ;CRZ1234;20.00"));
        data.donationDataAdd(data.donationParse("17/04/2023;22222222B;ACN;ACN0000;10.00"));
        data.donationDataAdd(data.donationParse("18/04/2023;33333333C;MSF;MSF9999;45.99"));

        // b) Añadir 2 donaciones más
        data.donationDataAdd(data.donationParse("19/04/2023;44444444D;ACN;ACN1111;30.00"));
        data.donationDataAdd(data.donationParse("20/04/2023;55555555E;CRZ;CRZ0000;12.50"));

        // c) Añadir 1 donación ya existente
        data.donationDataAdd(data.donationParse("15/04/2023;12345678N;ACN;ACN8455;15.50"));

        // d) Eliminar 2 donaciones existentes
        data.donationDataDel("16/04/2023", "11111111A", "CRZ1234");
        data.donationDataDel("18/04/2023", "33333333C", "MSF9999");

        // e) Eliminar 1 donación NO existente
        data.donationDataDel("01/01/2024", "99999999Z", "AAA0000");

        data.printAll();
        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Mostrar primera donación");
            System.out.println("2. Mostrar siguiente (pide posición)");
            System.out.println("3. Mostrar anterior (pide posición)");
            System.out.println("4. Mostrar donación por posición");
            System.out.println("5. Eliminar donación");
            System.out.println("6. Añadir donación");
            System.out.println("7. Mostrar todas");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(data.donationDataGet(0));
                    break;

                case 2:
                    System.out.print("Dime posicion: ");
                    int pos = sc.nextInt();
                    System.out.println(data.donationDataGet(pos + 1));
                    break;

                case 3:
                    System.out.print("Dime posicion: ");
                    pos = sc.nextInt();
                    System.out.println(data.donationDataGet(pos - 1));
                    break;

                case 4:
                    System.out.print("Dime posición: ");
                    pos = sc.nextInt();
                    System.out.println(data.donationDataGet(pos));
                    break;

                case 5:
                    System.out.print("Fecha: ");
                    String date = sc.nextLine();
                    System.out.print("Documento: ");
                    String doc = sc.nextLine();
                    System.out.print("ProjectCode: ");
                    String code = sc.nextLine();

                    data.donationDataDel(date, doc, code);
                    break;

                case 6:
                    sc.nextLine();
                    System.out.println("Introduce donación:");
                    String texto = sc.nextLine();
                    Donation nueva = data.donationParse(texto);
                    if (nueva != null) {
                        data.donationDataAdd(nueva);
                    }

                    break;

                case 7:
                    data.printAll();
                    break;


                default:
                    System.out.println("Opcion no válida");
                    break;
            }


        }while (opcion !=0);


    }
}