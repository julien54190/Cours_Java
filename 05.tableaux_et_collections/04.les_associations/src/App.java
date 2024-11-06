import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        var departement = new TreeMap<Integer, String>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
            
        });

        departement.put(1, "Ain");
        departement.put(2, "Aisnes");
        //departement.put(54, "Meuthe-et-Moselle");

        //departement.put(54, "Meuthe-et-Moselle modifié");
        departement.put(1, "Ain modifié");

        System.out.println(departement);

        for (Map.Entry entry : departement.entrySet()) {
            System.out.println("Departement " + entry.getKey() + ": " + entry.getValue());
        }

    }
} 
