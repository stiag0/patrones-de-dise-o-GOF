
package animales;

/**
 *
 * @author stiago
 */

// The interface is implemented by many other
// subclasses that allow for many types of flying
// without effecting Animal, or Volar.

/*
con la interfaz somos capaces de implementar otras sublases
que nos permite cambiar el tipo sin afectar la clase Animal o algun otra
*/

/*
Con esto lo que hacemos es encapsular las propiedades especificas de los animales
y dandole dinamismo a las mismas, de manera que se puede cambiar objetos enteros de manera dinamica 
*/


public interface Volar {
	
   String fly();
   
}

// clase usada si el animal puede volar

class Vuela implements Volar{

	public String fly() {
		
		return "volando como un campeon";
		
	}
	
}

//Clase usada si el animal no puede volar

class NoVuela implements Volar{

	public String fly() {
		
		return "No puedo volar :(";
		
	}
	
}