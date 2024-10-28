public class App {
    public static void main(String[] args) throws Exception {
        
        var result = addition(12, 7);
        System.out.println("Addition Result: " + result);
        System.out.println(afficher("Victor ", "Hugo"));
        System.out.println(afficher("Hugo ", "Victor"));

        afficher2("julien ", "lucas ", "mélanie ", "lola ");
    }


    private static void afficher2(String chain1, String chain2, String... chaines) {
        System.out.println(chain1 + chain2);
        for (String chain : chaines) {
            System.out.println(chain);
        }
    }




    private static int addition(int i, int j) {
        return i + j;
    }

    private static String afficher(String chaine1, String chaine2) {
        return chaine1 + chaine2;
}

}


