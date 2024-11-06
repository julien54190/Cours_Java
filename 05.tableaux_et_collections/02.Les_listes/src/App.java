import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        

        var liste = new ArrayList<Integer>();
        liste.add(1);
        liste.add(3);
        liste.add(9);
        liste.add(55);
        liste.add(8);
        liste.add(22);

        liste.add(2, 10);

        liste.remove(3);

        for (int entier : liste) {
            System.out.println(entier);
        }

        if (liste.contains(22)) {
            System.out.println("La liste contient le nombre");
        }

        var liste2 = new ArrayList<ArrayList<ArrayList<Integer>>>();
        liste2.add(new ArrayList<>());
        liste2.add(new ArrayList<>());
        liste2.add(new ArrayList<>());

        liste2.get(1).add(new ArrayList<>());
        liste2.get(1).add(new ArrayList<>());

        liste2.get(1).get(1).add(123);

        System.out.println(liste2);

    }


}
