
public class Animal  {
	private int id; 
	private String nom;
	private double poids; 
	private static int compteur = 1; 
	
	// constructeur
	public Animal (int id, String nom, double poids){
		this.id = Animal.compteur; 
		this.compteur++; 
		this.nom=nom; 
		this.poids=poids; 
	}
	
	public double nourritureQuotidienne(){
		return poids/4;
	}
	

}

