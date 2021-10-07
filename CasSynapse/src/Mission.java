import java.util.Date;
import java.util.HashMap;

public class Mission {
    private final static int MAX = 10;
    //Attributs prives
    private String nom;
    private String description;
    private Integer nbHeuresPrevues;

    private HashMap<Date, Integer> releveHoraire;

    private Intervenant[] executant;

    //Constructeur
    public Mission(String nom, String description, Integer nbHeuresPrevues, HashMap<Date, Integer> releveHoraire) {
        this.nom = nom;
        this.description = description;
        this.nbHeuresPrevues = nbHeuresPrevues;
        this.releveHoraire = releveHoraire;
        this.executant = new Intervenant[MAX];
    }


    public void ajoutReleve(Date jour, Integer nbHeures)
    {
        Integer res = 0;

        if (nbHeures>8)
        {
            releveHoraire.forEach((key, value) -> {
                res += value;
            });
            releveHoraire.put(jour, nbHeures);
        }

    }

    public Integer nbHeuresEffectues() {
        Integer res = 0;

        releveHoraire.forEach((key, value) -> {
            res += value;
        });

        res = res - this.nbHeuresPrevues;
        return res;
    }


    //Getter & Setter

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNbHeuresPrevues() {
        return nbHeuresPrevues;
    }

    public void setNbHeuresPrevues(Integer nbHeuresPrevues) {
        this.nbHeuresPrevues = nbHeuresPrevues;
    }

    public HashMap<Date, Integer> getReleveHoraire() {
        return releveHoraire;
    }

    public void setReleveHoraire(HashMap<Date, Integer> releveHoraire) {
        this.releveHoraire = releveHoraire;
    }

    public Intervenant[] getExecutant() {
        return executant;
    }

    public void setExecutant(Intervenant[] executant) {
        this.executant = executant;
    }
}
