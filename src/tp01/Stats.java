package tp01;

import java.util.List;

public class Stats {
    public void afficheGroupe(List<Etudiant> l){
        for (Etudiant e:l) {
            System.out.println(e.getValue());
            System.out.println(e.getMaximumEtud());
            System.out.println(e.getMinimumEtud());
        }
    }
    public double getMoyenneGroupe(List<Etudiant> l){
        double moy=0;
        for (Etudiant e:l) {
            moy+=e.getValue();
        }
        return moy/l.size();
    }
    public double getMinimumGroupe(List<Etudiant> l){
        double min=l.get(0).getValue();
        for (Etudiant e:l) {
           if(e.getValue()<min){
               min=e.getValue();
           }
        }
        return min;
    }
    public double getMaximumGroupe(List<Etudiant> l){
        double max=l.get(0).getValue();
        for (Etudiant e:l) {
            if(e.getValue()>max){
                max=e.getValue();
            }
        }
        return max;
    }
}
