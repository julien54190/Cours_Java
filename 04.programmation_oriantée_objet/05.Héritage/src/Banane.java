
public class Banane extends Fruit {

    public Banane(String Nom, String Couleur, String Origine) {
        super(Nom, Couleur, Origine);
        
    }

    @Override
    public String getNom() {
        return "viens de la classe fille " + super.getNom();
    }

    @Override
    public void methodeAbstract() {
        System.out.println("Ma méthode abstract");
    }

}
