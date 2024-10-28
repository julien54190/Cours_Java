public class App {
    public static void main(String[] args) throws Exception {
        var chaine = String.valueOf(12);
        Fonction();
        Fonction2(12);
        var result = Fonction3(20);
        System.out.println(result);
    }

    public static void Fonction(){
        System.out.println("une fonction");
    }

    public static void Fonction2(int entier){
        System.out.println("une fonction avec un entier : " + entier);
    }

    public static String Fonction3(int entier){
        return "une fonction qui retourne une chaine : " + entier;
    }
}
