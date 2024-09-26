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

        // Les Opérateurs

        var entier5 = -12;
        var addition = 1+2;
        var soustration = 5-2.2;
        var multiplication = 3*2;
        var division = 5/2;
        var modulo = 5%2;

        var caractere = 'b';
        System.out.println((char) (caractere + 'a'));
        System.out.println(caractere + 'a');

        addition += 5; // addition = addition + 5
        System.out.println(addition);

        addition++;
        System.out.println(addition);

        var plusPetit = 4;
        var plusLong = 8;
        var comparaison = plusPetit == plusLong;
        var comparaison2 = plusPetit < plusLong;
        var comparaison3= plusPetit <= plusLong;
        var comparaison4 = plusPetit > plusLong;
        var comparaison5 = plusPetit >= plusLong;
        var comparaison6 = plusPetit != plusLong;
        System.out.println(comparaison);
        System.out.println(comparaison2);
        System.out.println(comparaison3);
        System.out.println(comparaison4);
        System.out.println(comparaison5);
        System.out.println(comparaison6);

        var oui = true;
        var non = false;

        var comparaison7 = oui || non;
        var comparaison8 = oui && non;
        System.out.println(comparaison7);
        System.out.println(comparaison8);
        System.out.println(!comparaison8);
        System.out.println(!comparaison8);

        var chaine = "contenu";
        var chaine2 = "contenu";

        System.out.println((chaine + " modifié"));
        System.out.println(chaine.equals(chaine2));

        // Multabilité et immuabilité (on peu changer ou pas une variable)

        var nbr = 3;
        nbr = 5;

        final var nbr2 = 3;
        //nbr2 = 5 elle est immuable on peut pas la changer

        var chaine6 = "chaine";
        chaine6 = "abc";
        System.out.println(chaine6);
    }
}