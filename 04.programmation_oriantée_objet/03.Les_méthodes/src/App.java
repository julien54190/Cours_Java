public class App {
    public static void main(String[] args) throws Exception {
        Fruit fruit = new Fruit("fraise","Rouge","France");
        Fruit fruit2 = new Fruit("Banane","Jaune", "Inde");

        System.out.println(fruit.estFrancais());
        System.out.println(fruit2.estFrancais());

        fruit.estFrancais(12);
    }
}
