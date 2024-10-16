import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var condition = true;
        if (condition == true) System.out.println("hello");

        var saisieUtilisateur = new Scanner(System.in);

        System.out.println("Saisissez votre age : ");
        var age = saisieUtilisateur.nextInt();

        if (age >= 18) {
            System.out.println("Vous êtes majeur!!!");
        } else if (age < 0){
            System.out.println("Age non valide");
        }else {
            System.out.println("Vous êtes mineur!!!");
        }
        if (age >= 18) {
            System.out.println("Vous êtes centenaire1!!!");
        }
        }
    }
