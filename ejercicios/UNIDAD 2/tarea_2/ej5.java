import java.util.Scanner;

public class ej5 {

    public static void run(Scanner sc) {


                System.out.println("***** MENÚ DE SELECCIÓN *****");
                System.out.println("***** 1. Añadir un entrante. *****");
                System.out.println("***** 2. Añadir un plato principal. *****");
                System.out.println("***** 3. Elegir postre. *****");
                System.out.println("***** 4. No sentarme en este restaurante porque... *****");
                System.out.print("Elige una opción: ");
                int opcion = sc.nextInt();
                System.out.println();
                switch (opcion) {
                    case 1:
                        System.out.println("Has elegido añadir un entrante, elige ahora cual:.");
                        System.out.println("***** 1. Aceitunas *****");
                        System.out.println("***** 2. Patatas Bravas *****");
                        System.out.println("***** 3. Ensaladilla Rusa *****");
                        Scanner ent = new Scanner(System.in);
                        int entrante= ent.nextInt();
                            switch (entrante){
                                    case 1:
                                        System.out.println("Has elegido Aceitunas.");
                                        break;
                                    case 2:
                                        System.out.println("Has elegido Patatas Bravas.");
                                        break;
                                    case 3:
                                        System.out.println("Has elegido Ensaladilla Rusa.");
                                        break;
                            }
                        break;
                    case 2:
                        System.out.println("Has elegido añadir un plato principal.Elige cual");
                        System.out.println("***** 1. Costillas *****");
                        System.out.println("***** 2. Hamburguesa *****");
                        System.out.println("***** 3. Espaguettis *****");
                        Scanner platPrin = new Scanner(System.in);
                        int platoPrincipal= platPrin.nextInt();
                        switch (platoPrincipal){
                            case 1:
                                System.out.println("Has elegido Costillas.");
                                break;
                            case 2:
                                System.out.println("Has elegido Hamburguesa.");
                                break;
                            case 3:
                                System.out.println("Has elegido Espaguettis.");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Has elegido un postre.Elige cual");
                        System.out.println("***** 1. Tarta de Queso *****");
                        System.out.println("***** 2. Helado de Fresa *****");
                        System.out.println("***** 3. Coulan de Chocolate *****");
                        Scanner pos = new Scanner(System.in);
                        int postre= pos.nextInt();
                        switch (postre){
                            case 1:
                                System.out.println("Has elegido Tarta de Queso.");
                                break;
                            case 2:
                                System.out.println("Has elegido Helado de Fresa.");
                                break;
                            case 3:
                                System.out.println("Has elegido Coulan de Chocolate.");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Has decidido no sentarte en este restaurante...");
                        System.out.println("***** ¿Por qué motivo? *****");
                        System.out.println("1. El servicio es lento.");
                        System.out.println("2. Los precios son muy altos.");
                        System.out.println("3. El local está sucio.");
                        System.out.println("4. No hay platos de mi gusto.");
                        System.out.print("Elige una opción: ");
                        int motivo = sc.nextInt();
                        System.out.println();
                        switch (motivo) {
                            case 1:
                                System.out.println("Motivo: El servicio es lento.");
                                break;
                            case 2:
                                System.out.println("Motivo: Los precios son muy altos.");
                                break;
                            case 3:
                                System.out.println("Motivo: El local está sucio.");
                                break;
                            case 4:
                                System.out.println("Motivo: No hay platos de mi gusto.");
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, elige entre 1 y 4.");
                        }
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elige entre 1 y 4.");
                }
            }
        }



