package exe1;

public class TacheComplexe implements Tache{
	public String nom;
	public int cout;
	public TacheComplexe(String nom, int cout) {
		super();
		this.nom = nom;
		this.cout = cout;
	}
	@Override
	public String getNom() {
		return nom;
	}
	@Override
	public int getCout() {
		return cout;
	}
	
}
