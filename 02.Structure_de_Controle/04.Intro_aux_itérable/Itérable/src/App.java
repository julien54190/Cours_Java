
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        var entier = 2;

        //tableau

        int[] entiers = {1, 2, 3};
        int[] entiers2 = new int [10];
        entiers2[0] = 2;

        System.err.println(entiers2[0]);
        System.err.println(entiers2[5]);
        //System.err.println(entiers[3]);
        //System.err.println(entiers2[10]);

        

        //Listes

        ArrayList<String> entiersList = new ArrayList<String>();
        entiersList.add("fraise");
        entiersList.add("Pommes");
        entiersList.add("Poires");
        entiersList.add("Fraise");

        System.out.println(entiersList.get(1));
        System.out.println(entiersList.get(3));


    }
}
