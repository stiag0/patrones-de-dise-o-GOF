package decorator;

public class PizzaMaker {
	
	public static void main(String[] args){
            
                /*
                    El objeto PlainPizza se envia a los constructores de
                    mozzarella, salsa de tomate, jamon y en general a todo
                    lo que componga la pizza.
                */
                
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new Jamon(new PlainPizza())));
		
		System.out.println("Ingredientes: " + basicPizza.getDescription());
		
		System.out.println("Precio: " + basicPizza.getCost());
		
	}
	
}

