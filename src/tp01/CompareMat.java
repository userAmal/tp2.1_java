package tp01;

import java.util.Comparator;

public class CompareMat implements Comparator<Etudiant>{

	@Override
	public int compare(Etudiant o1, Etudiant o2) {
		return o1.matricule.compareTo(o2.matricule);
	}

	


}
