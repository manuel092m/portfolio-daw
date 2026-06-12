package Prueba;


import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Manuel", 10));
        alumnos.add(new Alumno("Jose", 8));
        alumnos.add(new Alumno("Carlos", 5));

        alumnos.sort(new Comparator<Alumno>() {

            @Override
            public int compare(
                    Alumno a1,
                    Alumno a2
            ) {

                return Integer.compare(
                        a2.getNota(),
                        a1.getNota()
                );
            }
        });

        System.out.println(alumnos);
    }

}