
public class Carnivore extends Animal {

	public Carnivore (int id, String nom, double poids){
		super(id, nom, poids);
	}
	
	public double nourritureQuotidienne(){
		return super.nourritureQuotidienne()/4;
	}
}
