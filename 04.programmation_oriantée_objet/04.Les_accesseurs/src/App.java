public class App {
    public static void main(String[] args) throws Exception {
        
        Fruit fruit = new Fruit("fraise", "Rouge", "France");
        System.out.println(fruit.getNom());
        System.out.println(fruit.getCouleur());
        System.out.println(fruit.getOrigine());

        fruit.setNom("Banane");
        fruit.setCouleur("jaune");;
        fruit.setOrigine("Inde");;
        System.out.println(fruit.getNom());
        System.out.println(fruit.getCouleur());
        System.out.println(fruit.getOrigine());
    }
}
