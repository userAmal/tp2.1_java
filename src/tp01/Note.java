package tp01;

public class Note {
	private String NomCours;
	private double note;
	public double getNote() {
		return note;
	}
	public Note(String nomCours, double note) {
		super();
		NomCours = nomCours;
		this.note = note;
	}
	public String NomCours() {
		return NomCours;
	}
}
