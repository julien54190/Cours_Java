public class App {
    public static void main(String[] args) throws Exception {
        Fruit fruit = new Fruit("fraise", "rouge", "France");
        System.out.println("Nom : " + fruit.Nom);
        System.out.println("Couleur : " + fruit.Couleur);
        System.out.println("Origine : " + fruit.Origine);

        var fruit2 = new Fruit("banane");
        System.out.println("Nom : " + fruit2.Nom);
        System.out.println("Couleur : " + fruit2.Couleur);
        System.out.println("Origine : " + fruit2.Origine);
    
        //new Constant();

        System.out.println(Constant.pi);
    }
}
