import java.util.Date;

public class Project {
    private final static int MAX = 10;
    //Attributs prives
    private String nom;
    private Date debut;
    private Date fin;
    private Double prixFactureMO;
    //
    private Mission[] misions;
    //
    public Project(String nom, Date debut, Date fin, Double prixFactureMO) {
        this.nom = nom;
        this.debut = debut;
        this.fin = fin;
        this.prixFactureMO = prixFactureMO;
        this.misions = new Mission[MAX];
    }

    public Double margeBruteCourante() {
        Double ress = 0.0;
        Double ress1 = 0.0;

        for (Mission uneMision : misions) {
            if (uneMision!=null) {
                uneMision.getReleveHoraire().forEach((key, value) -> {
                    ress1 += value * uneMision.getExecutant().getTauxHoraire();
                });
            }
        }

        ress = this.prixFactureMO - ress1;
        return ress;
    }

    public Double cumulCoutMO() {
        Double ress = 0.0;
        for (Mission uneMision : misions) {
            if (uneMision!=null) {
                uneMision.getReleveHoraire().forEach((key, value) -> {
                    ress += value;
                });
            }
        }
        return ress;
    }

    //Getter & Setter


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Double getPrixFactureMO() {
        return prixFactureMO;
    }

    public void setPrixFactureMO(Double prixFactureMO) {
        this.prixFactureMO = prixFactureMO;
    }
}
