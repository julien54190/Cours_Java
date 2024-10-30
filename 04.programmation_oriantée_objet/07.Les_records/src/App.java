public class App {
    public static void main(String[] args) throws Exception {
        var fruit = new Fruit("Strowberry", "red", "French");
        var fruit2 = new Fruit("Strowberry", "red", "French");


        System.out.println(fruit.equals(fruit2));
        System.out.println(fruit.origin());
    }
}