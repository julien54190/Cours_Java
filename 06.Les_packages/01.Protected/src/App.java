import com.dyma.model.Fruit;

public class App {
    public static void main(String[] args) throws Exception {
        
        var fruit = new Fruit("fraise", "France");

       // fruit.name; // ici je peux pas l'appeler car il est declarer en protected je peux donc seulement l'appeler dans une classe d'un meme package
    }
}
