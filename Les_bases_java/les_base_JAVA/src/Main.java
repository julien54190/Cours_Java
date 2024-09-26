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

        // convertion de type

        byte fromByte = 12;
        int toInt = fromByte;
        System.out.println(toInt);

        float fromFloat = 12.43f;
        double toDouble = fromFloat;

        char fromChar = 'd';
        int toIntFromChar = fromChar; // = 100 car entier d =100 si c = 99
        System.out.println(toIntFromChar);

        int valeurDeD = 100;
        char d = (char) valeurDeD;
        System.out.println(d);

        float fromFloat2 = 12.5f;
        int toInt2 = (int) fromFloat2;
        System.out.println(toInt2); // on va perdre tout se qui a derriere la virgule

        int fromInt3 = 130;
        byte toByte = (byte) fromInt3;
        System.out.println(toByte); // valeur differente car byte va que jusque 127

        String fromString = "123";
        var integer = Integer.valueOf(fromString);
        System.out.println(integer);

        int fromInt4 = 123;
        String toString4 = String.valueOf(fromInt4);
        System.out.println(toString4);

    }
}