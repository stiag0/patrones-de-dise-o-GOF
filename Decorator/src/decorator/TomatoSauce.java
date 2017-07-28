package decorator;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("Agregar salsa");
	}
	/*
            Simplemente avisamos que se añadio salsa de tomate y en la parte de
            abajo modificamos tanto lo que lleva como el costo
        */

        
	
	public String getDescription(){
		
		return tempPizza.getDescription() + ", Salsa de tomate";
		
	}
	
	public double getCost(){
		
		System.out.println("Costo de la salsa de tomate: " + .35);
		
		return tempPizza.getCost() + .35;
		
	}
	
}
