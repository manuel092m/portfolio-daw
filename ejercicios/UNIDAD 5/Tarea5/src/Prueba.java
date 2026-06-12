import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Prueba {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Pedro");

        ListIterator<String> it = nombres.listIterator(nombres.size());

        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        }
    }
