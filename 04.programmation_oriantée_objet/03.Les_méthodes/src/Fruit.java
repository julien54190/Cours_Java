
public class Fruit {
    public String Nom;
    public  String Couleur;
    public String Origine;

    public Fruit(String Nom, String Couleur, String Origine) {
        this.Nom = Nom;
        this.Couleur = Couleur;
        this.Origine = Origine;
    }

    public boolean estFrancais(){
        if (this.Origine.equals("France")) return true;
        return false;
    }

    public boolean estFrancais(int entier){
        if (this.Origine.equals("France")) return true;
        return false;
    }


}
