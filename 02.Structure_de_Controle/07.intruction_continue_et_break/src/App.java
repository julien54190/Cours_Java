
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        

        var fruits = new ArrayList<String>();
        fruits.add("Pomme");
        fruits.add("Poires");
        fruits.add("Fraises");
        fruits.add("Mangue");

        for (String fruit : fruits) {
            if (fruit.equals("Pomme")) {
                continue;
            }
            if (fruit.equals("Fraises")) {
                break;
            }
            System.out.println(fruit);

            switch (fruit) {
                case "Pommes" :
                    break;
                case "Poires" :
                    break;
            }
        }
    }
}
