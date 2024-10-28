
public class Fruit {
    private  String Nom;
    private  String Couleur;
    private  String Origine;

    public Fruit(String nom, String couleur, String origine) {
        this.Nom = nom;
        this.Couleur = couleur;
        this.Origine = origine;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        this.Nom = nom;
    }

    public String getCouleur() {
        return Couleur;
    }

    public void setCouleur(String couleur) {
        Couleur = couleur;
    }

    public String getOrigine() {
        return Origine;
    }

    public void setOrigine(String origine) {
        Origine = origine;
    }
    
    

}
