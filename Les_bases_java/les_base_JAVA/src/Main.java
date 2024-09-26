public class Main {
    public static void main(String[] args) {
        // les variables
        int result = 10;
        byte result2 = 20;

        var nomDeVariable = 10;

        System.out.println(String.format("le contenu de mes variables %s %s %s", result, result2, nomDeVariable));

        // Les types

        // les entiers
        byte octet = 127;
        short unPeuPlusGrand = 2314;
        int entier = 843215;
        long entierLong = 7646879574534L;

        // float
        float petitFloat = 42.4f;
        double grandFloat = 8431.456;

        // les Caractères
        char uneLettre = ':';
        char uneLettre2 = '\'';

        //les booléens
        boolean uneCondition = true;

        // les chaîne de caractères
        String uneChaine = "ok tout va bien ";

        //inference
        var nimpoteQuoi = true;
        var nimpoteQuoi2 = "ok ok ok ok ";
        var nimpoteQuoi3 = 10.5f;

    }
}