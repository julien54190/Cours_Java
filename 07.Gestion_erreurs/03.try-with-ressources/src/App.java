import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        try (var scanner = new Scanner(System.in)){
            System.out.print("Enter a number between 1 and 100: ");
            scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number between 1 and 100.");
            
        }
    }
}
