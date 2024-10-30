
public class Fruit {

    // public FruitInterne fruitInterne;

    // public Fruit(){
    //     fruitInterne = new FruitInterne();
    // }

    // private  class FruitInterne{

    // }

    public void afficherAvecCallbacks(Callbacks callbacks){
        System.err.println("Le comportement normal de ma fonction");
        callbacks.execute();
}
}