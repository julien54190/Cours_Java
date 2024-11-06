import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {

        var ensembleFruit = new HashSet<Fruit>();

        ensembleFruit.add(new Fruit("fraise", "fance"));
        ensembleFruit.add(new Fruit("frais", "fance"));
        ensembleFruit.add(new Fruit("frais", "fance"));

        var result = ensembleFruit.contains(new Fruit("fraise", "fance"));

        System.out.println(result); 
    }
}
