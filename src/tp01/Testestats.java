package tp01;

import java.util.Collections;
import java.util.Vector;

public class Testestats {
    public static void main(String[] args) {
        Vector<Etudiant> v=new Vector<>();
        Stats s=new Stats();
        v.add(new Etudiant("1","amal"));
        v.get(0).addNote(new Note("java",14));
        v.get(0).addNote(new Note("fr",16));
        v.add(new Etudiant("2","syrine"));
        v.get(1).addNote(new Note("java",6));
        v.get(1).addNote(new Note("fr",16));

        v.add(new Etudiant("3","soumaya"));
        v.get(2).addNote(new Note("java",17));
        v.get(2).addNote(new Note("fr",18));

        s.afficheGroupe(v);
        System.out.println("max classe"+ s.getMaximumGroupe(v));
        System.out.println("min classe"+ s.getMinimumGroupe(v));
        System.out.println(v);
        Collections.sort(v);
        System.out.println(v);
        CompareMat cm=new CompareMat();
        Collections.sort(v,cm);
        System.out.println(v);
        CompareNom cn=new CompareNom();
        Collections.sort(v,cn);
        System.out.println(v);


    }
}
