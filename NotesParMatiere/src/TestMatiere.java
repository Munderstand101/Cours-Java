import java.util.ArrayList;

public class TestMatiere
{
    public static void main(String[] args) {
        ArrayList<Double> listeNotes  = new ArrayList<Double>();
        listeNotes.add(12.0);
        listeNotes.add(14.0);
        listeNotes.add(9.0);


        ajouternote(listeNotes, 10);

        changernote(listeNotes, 10, 20);

        afichernotes(listeNotes);

        System.out.println("Moyenne : "+calculmoyenne(listeNotes));

        //ArrayList<Double> listeNotes = new ArrayList<Double>();
        ArrayList<Double> listeCoeficient = new ArrayList<Double>();

        listeCoeficient.add(2.0);
        listeCoeficient.add(1.0);
        listeCoeficient.add(0.5);
        listeCoeficient.add(0.5);

        System.out.println("Moyenne avec coef : "+calculMoyenneCoef(listeNotes, listeCoeficient));

    }

    public static void ajouternote(ArrayList<Double> laliste, double n)
    {
        laliste.add(n); // ajoute la note n à l’ArrayList laliste
    }


    public static void afichernotes(ArrayList<Double> laliste)
    {
        for (Double note:laliste) {
            System.out.println(note);
        }
    } // affiche toutes les notes de l’ArrayList laliste

    public static double calculMoyenneCoef(ArrayList<Double> listeNotes, ArrayList<Double> listeCoef) {
        Double res=0.0;
        Double totalCoef=0.0;

        for (int i =0; i<listeCoef.size(); i++)
        {
            res += listeNotes.get(i) * listeCoef.get(i);
            totalCoef += listeCoef.get(i);
        }
        res = res/totalCoef;
        return res;

    }

    public static double calculmoyenne(ArrayList<Double> laliste) {
        Double res=0.0;

        for (Double note:laliste) {
            res += note;
        }

        res = res/laliste.size();

        return res;

    }//calcule et retourne la moyenne des notes contenues dans l’ArrayList laliste ;


    public static void changernote(ArrayList<Double> laliste,double anciennenote, double nouvellenote) {
       
      /* boolean trouver = false;
        int j = 0;

        while(trouver==false && j<laliste.size()){

            if (laliste.get(j) == anciennenote)
            {
                trouver = true;
            }
            else {
                j++;
            }
        }

        if (trouver = true){
            laliste.set(j, nouvellenote);
        }*/

        laliste.set(laliste.indexOf(anciennenote), nouvellenote);


    }


}