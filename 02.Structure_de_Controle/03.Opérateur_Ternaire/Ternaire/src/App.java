public class App {
    public static void main(String[] args) throws Exception {
        var isMajeurString = "";
        var age = 16;
if (age >= 18) {
    isMajeurString = "Majeur";
} else {
    isMajeurString = "Mineur";
}
System.out.println(isMajeurString);

var age2 = 18;

var isMajeurString2 = age2 >= 18 ? "Majeur" : "Mineur";
System.out.println(isMajeurString2);
    };


}
