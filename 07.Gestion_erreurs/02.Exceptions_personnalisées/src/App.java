
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            var saisieUtilisateur = inputFromUser();
            System.out.println(saisieUtilisateur);
        } catch (BlankInputException e){
            System.out.println(e.getMessage());
        }


        
        
            }
        
            private static String inputFromUser() throws BlankInputException {
                
                System.out.println("Veuillez entrer une valeur: ");
                var scanner = new Scanner(System.in);
                var result = scanner.nextLine();
                if(result.isBlank()){
                    throw new BlankInputException("la saisie ne peux pas être vide");
                }
                return result;
            }
}
