package decorator;
/*
    Implementamos solo los metodo de la interfaz Pizza
    A su vez cada pizza comenzará como PlainPizza
*/
public class PlainPizza implements Pizza {
 
	public String getDescription() {
		
		return "Masa Delgada";
	
	}

	public double getCost() {

		System.out.println("Costo de la masa: " + 4.00);
		
		return 4.00;
	
	}
 
}
