public class App {
    public static void main(String[] args) throws Exception {
        
        var banane = new Banane("banane", "jaunes", "Inde");
        System.out.println(banane.getNom());
        banane.setNom("Orange");
        System.out.println(banane.getNom());
    }
}
