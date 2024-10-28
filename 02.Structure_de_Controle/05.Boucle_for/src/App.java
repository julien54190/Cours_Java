
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Classique

        for (int i = 0; i < 10; i++) {
            System.out.println("Compteur : " + i);
        }

        // Parcours de collections
        var fruits = new ArrayList<String>();
        fruits.add("pomme");
        fruits.add("orange");
        fruits.add("fraises");

        for (String fruit : fruits) {
            System.out.println("Fruit : " + fruit);
        }
    
    } 
}
