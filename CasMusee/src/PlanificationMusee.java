import java.util.ArrayList;

public class PlanificationMusee {

    private ArrayList<Oeuvre> lesOeuvres;
    private ArrayList<ExpositionTemporaire> lesExpos;

    public ArrayList<Oeuvre> getOeuvrePeriode(int andeb, int anfin) {
        ArrayList<Oeuvre> res = new ArrayList<Oeuvre>();


// deux facon ...
        
       /*  for (int i=0; i<lesOeuvres.size(); i++ ) {
            if(this.lesOeuvres.get(i).getAnnee()>=andeb && this.lesOeuvres.get(i).getAnnee()>=anfin)
            {
                res.add(this.lesOeuvres.get(i))
            }
         }*/


        for (Oeuvre uneOeuvre : lesOeuvres) {
            if (uneOeuvre.getAnnee() > andeb && uneOeuvre.getAnnee() < anfin) {
                res.add(uneOeuvre);
            }
        }
        return res;
    }

    public ArrayList<ExpositionTemporaire> expoLaPlusVisitee() {
        int memoire = 0;
        ExpositionTemporaire expo;
        ArrayList<ExpositionTemporaire> plusVisite;
        plusVisite = new ArrayList<ExpositionTemporaire>();
        for (ExpositionTemporaire visite : lesExpos){
            if(visite.getNbVisites()>memoire){
                memoire= visite.getNbVisites();
            }
            for (ExpositionTemporaire uneExpo : lesExpos){
                if(memoire==uneExpo.getNbVisites()){
                    plusVisite.add(uneExpo);
                    expo = uneExpo;
                }
            }
        }
        return plusVisite;
    }

    public ArrayList<Oeuvre> getLesOeuvres() {
		return lesOeuvres;
	}
	public void setLesOeuvres(ArrayList<Oeuvre> lesOeuvres) {
		this.lesOeuvres = lesOeuvres;
	}
	public ArrayList<ExpositionTemporaire> getLesExpos() {
		return lesExpos;
	}
	public void setLesExpos(ArrayList<ExpositionTemporaire> lesExpos) {
		this.lesExpos = lesExpos;
	}


}