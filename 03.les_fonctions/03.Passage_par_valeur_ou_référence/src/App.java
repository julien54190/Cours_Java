import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        var list  = new ArrayList<String>(); 
        list.add("value1");
        modify(list);
        System.out.println("Valeur de list après modification : " + list);
    }

    private static void modify(ArrayList<String> list) {
        list.add("value2"); 
    }
}
