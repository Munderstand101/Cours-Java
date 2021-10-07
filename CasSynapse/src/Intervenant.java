public class Intervenant {

    //Attributs prives
    private String nom;
    private Double tauxHoraire;

    //Constructeur
    public Intervenant(String nom, Double tauxHoraire) {
        this.nom = nom;
        this.tauxHoraire = tauxHoraire;
    }

    //Getter & Setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(Double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }
}

