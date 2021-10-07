import java.util.ArrayList;
import java.util.Date;

public class ExpositionTemporaire {

    private final static int MAX = 60;

    private String nom;
    private int anPeriodeDebut;
    private int anPeriodeFin;
    private int nbVisites;
    private Date dateDebut;
    private Date dateFin;
    private Emplacement[] lesEmplacements;
    private ArrayList<Oeuvre> lesOeuvres;
    private PlanificationMusee laPlanifMusee;


    public ExpositionTemporaire(String unnom, int andeb, int anfin, Date unedatedeb, Date unedeatefin) {
        this.nom = unnom;
        this.anPeriodeDebut = andeb;
        this.anPeriodeFin = anfin;
        this.nbVisites = 0;
        this.dateDebut = unedatedeb;
        this.dateFin = unedeatefin;
        
        this.lesOeuvres = laPlanifMusee.getOeuvrePeriode(andeb, anfin);
        this.initEmplacements();
    }

    
    public void afficherCarac() {
    	
    }
    
    public void initEmplacements() {
    	
    }
    
    public void affecterOeuvre(Tableau untableau){
    
       boolean temp = true;
       int i = 0;
       while (temp=true && i< lesEmplacements.length)
       {
    	   if (lesEmplacements[i].estDisponible() == true && lesEmplacements[i].getLargeur() >= untableau.getLargeur())
    	   {
    		   lesEmplacements[i].setlOeuvre(untableau);
    		   temp = false;
    	   }
    	   i++;
       }

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnPeriodeDebut() {
        return anPeriodeDebut;
    }

    public void setAnPeriodeDebut(int anPeriodeDebut) {
        this.anPeriodeDebut = anPeriodeDebut;
    }

    public int getAnPeriodeFin() {
        return anPeriodeFin;
    }

    public void setAnPeriodeFin(int anPeriodeFin) {
        this.anPeriodeFin = anPeriodeFin;
    }

    public int getNbVisites() {
        return nbVisites;
    }

    public void setNbVisites(int nbVisites) {
        this.nbVisites = nbVisites;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Emplacement[] getLesEmplacements() {
        return lesEmplacements;
    }

    public void setLesEmplacements(Emplacement[] lesEmplacements) {
        this.lesEmplacements = lesEmplacements;
    }

    public ArrayList<Oeuvre> getLesOeuvres() {
        return lesOeuvres;
    }

    public void setLesOeuvres(ArrayList<Oeuvre> lesOeuvres) {
        this.lesOeuvres = lesOeuvres;
    }
}