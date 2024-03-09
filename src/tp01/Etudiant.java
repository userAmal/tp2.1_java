package tp01;

import java.util.ArrayList;

public class Etudiant implements Istatisticable  ,Comparable<Etudiant>{
	public String matricule;
	public String nom;
	public ArrayList<Note> notes;
	public Etudiant(String matricule, String nom) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.notes = new ArrayList();
	}
	public void addNote(Note N) {
		notes.add(N);
	}
	public double getValue() {
		double moy=0;
		for(Note n:notes) {
			moy+=n.getNote();
		}
		return moy;
	}
	
	public double getMaximumEtud() {
		double max=notes.get(0).getNote();
		for(Note n:notes) {
			if(n.getNote()>max) {
				max=n.getNote();
			}
		}
		return max;
	}
	public double getMinimumEtud() {
		double min=notes.get(0).getNote();
		for(Note n:notes) {
			if(n.getNote()<min) {
				min=n.getNote();
			}
		}
		return min;
	}
	@Override
	public int compareTo(Etudiant e1) {
		if(getValue()>e1.getValue()) {
			return 1;
		}
		else if (getValue()<e1.getValue()) {return -1;}
		return 0;
	}
	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", moyenne :"+getValue();
	}
	
	}
	

	

