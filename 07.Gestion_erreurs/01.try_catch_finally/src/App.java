public class App {
    public static void main(String[] args) throws Exception {
        var chaine = "chaine";
        try {
            int entier = Integer.parseInt(chaine);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : la chaine de caractères ne peut être convertie en entier" + e.getMessage());
            //return;
        } catch (Exception e){
            System.out.println("Exception générique");
            //return;
        }
        finally {
            System.out.println("Fin du programme");
        }
        

        System.out.print("Tout c'est bien exécuté");


    }
}
