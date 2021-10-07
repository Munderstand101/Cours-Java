public class Oeuvre {
    private static int derniernum;
    private int num;
    private String titre;
    private int annee;
    private String artiste;

    public Oeuvre(String ptitre, int pannee, String partiste) {
        this.derniernum++;
        this.num = derniernum;
        this.titre = ptitre;
        this.annee = pannee;
        this.artiste = partiste;
    }

    public void afficheCarac() {
        System.out.println("Numéro : " + this.num);
        System.out.println("Titre : " + this.titre);
        System.out.println("Année : " + this.annee);
        System.out.println("Artiste : " + this.artiste);
    }

    public static int getDerniernum() {
        return derniernum;
    }

    public int getNum() {
        return num;
    }

    public String getTitre() {
        return titre;
    }

    public int getAnnee() {
        return annee;
    }

    public String getArtiste() {
        return artiste;
    }

    public static void setDerniernum(int derniernum) {
        Oeuvre.derniernum = derniernum;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }
}