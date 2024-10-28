
public abstract  class Fruit {
    private String Nom;
    private String Couleur;
    private String Origine;

    public Fruit(String Nom, String Couleur, String Origine) {
        this.Nom = Nom;
        this.Couleur = Couleur;
        this.Origine = Origine;
    }

    public abstract void methodeAbstract();

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
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
