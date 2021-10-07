public class Sculpture extends Oeuvre{
    //Attributs prives
    private String materiau;

    public Sculpture(String ptitre, int pannee, String partiste, String materiau) {
        super(ptitre, pannee, partiste);
        this.materiau = materiau;
    }

    public void afficherCarac() {
        super.afficheCarac();
        System.out.println("Materiau : " + this.materiau);
    }

    public String getMateriau() {
        return materiau;
    }

    public void setMateriau(String materiau) {
        this.materiau = materiau;
    }
}
