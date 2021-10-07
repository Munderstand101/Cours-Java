public class Sculpture extends Oeuvre{
    //Attributs prives
    private String materiau;
    //Methodes publiques
    //Consctructeur
    public Sculpture(String ptitre, int pannee, String partiste, String materiau) {
        super(ptitre, pannee, partiste);
        this.materiau = materiau;
    }
    //Affichage des attributs
    public void afficherCarac() {
        super.afficheCarac();
        System.out.println("Materiau : " + this.materiau);
    }
    //Getter & Setter
    public String getMateriau() {
        return materiau;
    }

    public void setMateriau(String materiau) {
        this.materiau = materiau;
    }
}
