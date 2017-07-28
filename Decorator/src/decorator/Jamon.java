package decorator;

public class Jamon extends ToppingDecorator {
       
    public Jamon(Pizza newPizza) {
		
		super(newPizza);

		System.out.println("Agregar Jamon");
	}
        
        /*
            Simplemente avisamos que se añadio Jamon y en la parte de
            abajo modificamos tanto lo que lleva como el costo
        */
    
    public String getDescription(){
		
		return tempPizza.getDescription() + ", Jamon";
		
	}
	
	public double getCost(){
		
		System.out.println("Costo del jamon: " + .75);
		
		return tempPizza.getCost() + .75;
		
	}
    
}
