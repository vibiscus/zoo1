
public class Herbivore extends Animal {
	private double RationH; 
	public Herbivore (int id, String nom, double poids, double RationH){
		super(id, nom, poids);
		this.RationH=RationH;
		}
		
	public double calculRation(){
		//return new Ration(Cereales, O); // ?? 
		return RationH; 
		}
	
	
	}
