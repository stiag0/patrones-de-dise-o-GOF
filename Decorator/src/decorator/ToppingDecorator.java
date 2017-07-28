package decorator;
/*
    Aquí veremos la relación que hay entre la pizza y los ingredientes
*/
abstract class ToppingDecorator implements Pizza {

	protected Pizza tempPizza;
        /*
            Todas las modificaciones a una pizza se realizaran dinamicamente
            para ello instanciamos la clase PlainPizza.
        */
	
	public ToppingDecorator(Pizza newPizza){
		
		tempPizza = newPizza;
		
	}
	
	public String getDescription() {
		
		return tempPizza.getDescription();
		
	}

	public double getCost() {
		
		return tempPizza.getCost();
		
	}
	
}
