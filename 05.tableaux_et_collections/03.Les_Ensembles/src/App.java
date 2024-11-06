import java.util.HashSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        var ensemble = new HashSet<String>();

        ensemble.add("apple");
        ensemble.add("banana");
        ensemble.add("cherry");
        ensemble.add(null);
        ensemble.add("stowberry");
        ensemble.add("Ananas");
        ensemble.add("banana");
        ensemble.add("Chicken");
        ensemble.add("cherry");
        ensemble.add("Spring");
        ensemble.add("American");
        ensemble.add(null);

        System.out.println("Original Ensemble: " + ensemble);

        if (ensemble.contains(",hb,j")){
            System.out.println("La valeurs existe");
        }else { System.out.println("la valeurs existe pas");}

        var ensemble2 = new TreeSet<String>();

        ensemble2.add("apple");
        ensemble2.add("banana");
        ensemble2.add("cherry");
        ensemble2.add("stowberry");
        ensemble2.add("Ananas");
        ensemble2.add("cherry");
        ensemble2.add("Chicken");
        ensemble2.add("apple");
        ensemble2.add("Spring");
        ensemble2.add("American");

        System.out.println("triage Ensemble: " + ensemble2);
    }
}
