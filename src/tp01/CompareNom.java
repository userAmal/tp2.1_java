package tp01;

import java.util.Comparator;

public class CompareNom implements Comparator<Etudiant>{
	@Override
	public int compare(Etudiant o1, Etudiant o2) {
		return o1.nom.compareTo(o2.nom);
	}
}
