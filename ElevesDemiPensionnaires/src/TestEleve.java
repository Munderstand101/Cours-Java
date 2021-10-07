import java.util.ArrayList;
import java.util.HashMap;

public class TestEleve {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Eleve unEleve1 = new Eleve(1,"DUPOND","Marcel");
        Eleve unEleve2 = new Eleve(2,"DUPRAT","Bernard");
        Eleve unEleve3 = new Eleve(3,"DUPLEX","Jacques");
        Eleve unEleve4 = new Eleve(4,"DUPLO","Gearges");
        Eleve unEleve5 = new Eleve(5,"LEDOUX","Edouard");

        HashMap<String,Eleve> listeCompleteEleves = new HashMap<String,Eleve>();

        //2
        listeCompleteEleves.put("1", unEleve1);
        listeCompleteEleves.put("2", unEleve2);
        listeCompleteEleves.put("3", unEleve3);
        listeCompleteEleves.put("4", unEleve4);
        listeCompleteEleves.put("5", unEleve5);

        HashMap<String,Eleve> listeDemiPensionaire = new HashMap<String,Eleve>();

        listeDemiPensionaire.put("1", unEleve1);
        listeDemiPensionaire.put("2", unEleve2);
        listeDemiPensionaire.put("3", unEleve3);
        listeDemiPensionaire.put("4", unEleve4);
        listeDemiPensionaire.put("5", unEleve5);


        System.out.println("------------------------------");

        listeCompleteEleves.forEach((key, value)->{
            value.afficher();
        });

        System.out.println("------------------------------");

        listeDemiPensionaire.forEach((key, value)->{
            value.afficher();
        });

    }
}