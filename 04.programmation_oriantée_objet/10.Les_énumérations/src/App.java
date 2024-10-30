public class App {
    public static void main(String[] args) throws Exception {
        Jour jour = Jour.Lundi;

        var date =  new DateCustome(Jour.Mercredi);

        System.out.println("Jour de la semaine : " + date.jour);
    }
}
