public class Eleve {

    private int numEleve;
    private String nom;
    private String prenom;

    public Eleve(int numEleve, String nom, String prenom) {
        this.numEleve = numEleve;
        this.nom = nom;
        this.prenom = prenom;
    }

    public void afficher() {
        System.out.println(" ------- Eleve : --------- ");
        System.out.println("Numero Eleve : " + this.numEleve);
        System.out.println("Nom Eleve : " + this.nom);
        System.out.println("Prenom Eleve : " + this.prenom);
        System.out.println(" ------------------------- ");
        System.out.println(" ");
    }

    public int getNumEleve() {
        return numEleve;
    }

    public void setNumEleve(int numEleve) {
        this.numEleve = numEleve;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


}