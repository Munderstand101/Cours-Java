public class Emplacement {

    private double largeur;
    private boolean disponible;
    private Oeuvre lOeuvre;

    public Emplacement(double plarg, boolean pdispo, Oeuvre ploeuvre) {
        this.largeur = plarg;
        this.disponible = pdispo;
        this.lOeuvre = ploeuvre;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public boolean estDisponible() {
        return disponible;
    }
 
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Oeuvre getlOeuvre() {
        return lOeuvre;
    }

    public void setlOeuvre(Oeuvre lOeuvre) {
        this.lOeuvre = lOeuvre;
    }
}

