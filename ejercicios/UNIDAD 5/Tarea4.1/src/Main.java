public class Main {
    public static void main(String[] args){

        char[] datos = {'H','o','l','a',' ','M','a','n','u'};
        Char c = new Char(datos);

        System.out.println("Longitud: " + c.length());
        System.out.println("Char en pos 1: " + c.charAt(1));
        System.out.println("SubSequence (reves): " + c.subSequence(0, 4));
        System.out.println("Cadena original: " + c.toString());

    }
}