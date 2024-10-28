public class App {
    public static void main(String[] args) throws Exception {
        var fruit = new Fruit("Strowberry", "red", "French");
        var fruit2 = new Fruit("Strowberry", "red", "French");
        System.out.println(fruit == fruit2); // false
        System.out.println(fruit.equals(fruit2)); // flase
        System.out.println(fruit); 
    }
}
