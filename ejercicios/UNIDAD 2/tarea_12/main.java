public class main {

    public static void main(String[] args) {

        //a.
        String palabra = "Manuel";
        System.out.println(palabra);

        //b.
        System.out.println(palabra.length());

        //c.
        System.out.println(palabra.toUpperCase());
        System.out.println(palabra.toLowerCase());

        //d.
        String saludo = "Hola ";

        String resultado = saludo.concat(palabra);
        System.out.println(resultado);

        //e.
        String sub = palabra.substring(1);
        System.out.println(sub);

        //f.
        String frase = "Vale Manuel, has llegado al destino.";
        int posicion = frase.indexOf("Manuel");
        System.out.println("Primera aparicion en el indice: " + posicion);

        //g.
        String reemplazo = frase.replace("l destino", " casa");
        System.out.println(reemplazo);

        //h.
        String[] palabras = frase.split(" ");
        System.out.println();
        System.out.println(palabras[1]);
        System.out.println(palabras[5]);
        System.out.println();

        //i.
        String nombremin = "manuel";
        System.out.println(nombremin.equals(palabra));
        System.out.println(nombremin.equalsIgnoreCase(palabra));

        //j. compareTo() es un método de la clase String que sirve para comparar dos cadenas alfabéticamente
        String corto = "Manu";
        System.out.println(palabra.compareTo(corto));

        //k. El método trim() se usa para eliminar los espacios en blanco que están al principio y al final de una cadena.
        String sucio = " Hola, que tal como vas     ";
        String limpio = sucio.trim();
        System.out.println("Antes: [" + sucio + "]");
        System.out.println("Después: [" + limpio + "]");

        //l.
        boolean empieza = frase.startsWith("Vale");

        boolean acaba = frase.endsWith("Adios");

        System.out.println("EMPEZAR POR 'HOLA': " + empieza);
        System.out.println("ACABAR POR 'ADIOS': " + acaba);

        //m.
        char pos3 = frase.charAt(3);
        System.out.println("Posicion 3: "+ pos3);

        //n.
        String letra = String.valueOf(frase.charAt(3));
        System.out.println(letra);

    }
}
