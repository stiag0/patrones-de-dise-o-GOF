
package animales;

/**
 *
 * @author stiago
 */
public class AnimalMain{
	
	public static void main(String[] args){
		
		
                Animal tony = new Perro();
		Animal Rojelia = new Pajaro();
		
		System.out.println("perro: " + tony.tryToFly());
		
		System.out.println("pajaro: " + Rojelia.tryToFly());
		
		// Digamos que tony se comio una piedra de kriptonita y ya puede volar
		
		tony.setFlyingAbility(new Vuela());
		
		System.out.println("perro: " + tony.tryToFly());
		
	}
	
}
