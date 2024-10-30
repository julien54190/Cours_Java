public class App {
    public static void main(String[] args) throws Exception {
        var fruit = new Fruit();
        fruit.afficherAvecCallbacks(new Callbacks() {
            @Override
            public void execute() {
                System.out.println("Callback executé!");
            }
        }) ;
    }


}
