package decorator;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza newPizza) {
		
		super(newPizza);

		System.out.println("Agregar Mozzarella");
	}
	/*        
            Simplemente avisamos que se añadio queso mozarrela y en la parte de
            abajo modificamos tanto lo que lleva como el costo
        */
	
	public String getDescription(){
		
		return tempPizza.getDescription() + ", Mozzarella";
		
	}
	
	public double getCost(){
		
		System.out.println("Costo de la mozzarella: " + .50);
		
		return tempPizza.getCost() + .50;
		
	}
	
}