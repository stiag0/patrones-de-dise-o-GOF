
package animales;

/**
 *
 * @author stiago
 */
public class Animal {
	
	private String nombre;
	private double altura;
	private int peso;
	private String comidaFav;
	private double velocidad;
	private String sonido;
	
	
        /*
        En este caso vamos a usar una interface para generar subclases
        que nos permitira tener varios tipos de un mismo objeto a nuestra disposicion
        */
	
        /*
        Ademas Animal.java no sabe que tipovolador es, el solo sabe
        que tiene subclases a su disposición 
        */
        
        /*
        De esta manera somos capaces de cambiar las avilidades
        del objeto en tiempo de ejecucion.
        */
        
        
        
	
	public Volar flyingType;
	
	public void setNombre(String newName){ nombre = newName; }
	
        public String getNombre(){ 
            return nombre; 
        }
	
	public void setAltura(double newHeight){
            altura = newHeight; 
        }
	
        public double getAltura(){ 
            return altura; 
        }
	
	public void setPeso(int newWeight){ 
		if (newWeight > 0){
			peso = newWeight; 
		} else {
			System.out.println("¿como vas a tener peso negativo? los animales siguen las leyes basicas de la fisica >:(");
		}
	}
	public double getPeso(){
            return peso; 
        }
	
	public void setComidaFav(String newFavFood){
            comidaFav = newFavFood; 
        }
	
        public String getComidaFav(){ 
            return comidaFav; 
        }
	
	public void setVelocidad(double newSpeed){ 
            velocidad = newSpeed; 
        }
	
        public double getVelocidad(){ 
            return velocidad;
        }
	
	public void setSonido(String newSound){
            sonido = newSound; 
        }
	
        public String getSonido(){ 
            return sonido; 
        }
	
        /*
        No quieres añadir metodos de mas a la super clase.
        tienes que separar lo que es diferente entre las subclses y la super clase
        */
        
	// Animal.java le entrega la responsavilidad de tiopVolador a Volar.java
	
	
	public String tryToFly(){
		
		return flyingType.fly();
		
	}
	
        /*
        Si quieres poder cambiar el tipoVolador dinamicamente
        agrega este metodo
        */
	
	public void setFlyingAbility(Volar newFlyType){
		
		flyingType = newFlyType;
		
	}
	
}
