import java.util.HashMap;

public class PlanificationVille {

    private HashMap<String, PlanificationMusee> lesPlanifMusee = new HashMap();
    
    public void afficherLesExpoMusee(String pNomMusee) {
    	PlanificationMusee laPlanifMusee = this.lesPlanifMusee.get(pNomMusee);
    	
    	for (ExpositionTemporaire lExpo:laPlanifMusee.getLesExpos())
    	{
    		lExpo.afficherCarac();
    	}
    	
    }
    

}
