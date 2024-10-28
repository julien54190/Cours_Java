public class App {
    public static void main(String[] args) throws Exception {
        var result = addition(5,12);
        System.out.println("Result: " + result);
    }

    /**
     * cette finction additione deux parametre placer en entrée et retourne le resultat de l'addition.
     * @param i le premier entrée à additioner
     * @param j le deuxieme entrée à additioner
     * @return int le resultat de l'adition
     */

    public static int addition(int i, int j) {
        return i + j;

    }
        
    }

