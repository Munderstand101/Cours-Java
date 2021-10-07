public class Tableau extends Oeuvre {

    private double largeur;
    private double hauteur;

    public Tableau(String ptitre, int pannee, String partiste, double plarg, double phaut) {
        super(ptitre, pannee, partiste);
        this.largeur = plarg;
        this.hauteur = phaut;
    }

    public void afficherCarac() {
        super.afficheCarac();
        System.out.println("Largeur : " + this.largeur);
        System.out.println("Hauteur : " + this.hauteur);
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }
}