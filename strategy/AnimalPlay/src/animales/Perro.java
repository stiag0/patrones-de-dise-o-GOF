
package animales;

/**
 *
 * @author stiag
 */
public class Perro extends Animal{
	
	public void cavar(){
		
		System.out.println("cava un hoyo");
		
	}
	
	public Perro(){
		
		super();
		
		setSonido("Guau");
		
		/*
                Aqui es donde definimimos que tipo va a ser, en este caso NoVuela
                */
                
		flyingType = new NoVuela();
		
        }
	
}
