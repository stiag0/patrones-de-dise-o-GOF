
package animales;

/**
 *
 * @author stiago
 */
public class Pajaro extends Animal{
	
	// El constructor inicializa todos los objetos
	
	public Pajaro(){
		
		super();
		
		setSonido("Pio");
		
                /*
                Aqui es donde definimimos que tipo va a ser, en este caso si Vuela
                */
                
		flyingType = new Vuela();
		
	}
	
}