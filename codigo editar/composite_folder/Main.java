/*
* ejemplo de patron compositor
*
* este plantea el uso de un metodo abstracto del cual heredan las clases del proyecto
* en este caso se plantea el costo de realizar una hoja y si adjuntamos estas en un libro que costo tiene este libro
*/

public class Main {
 /**
  * clase donde se inica el proyecto
  *
  * @param args
  */
 public static void main(String[] args) {
     AbstractCompositor componenteUno = new Hoja(10); //crea un entidad de Hoja
     System.out.println("la primera hoja tiene un costo de: " + componenteUno.getCosto()); //muestra el costo de la hoja creada

     AbstractCompositor componenteTres = new Hoja(3); //crea una segunda hoja
     AbstractCompositor componenteDos = new Libro();  //crea un libro sin costo todavia

     //agrega las hojas al libro
     componenteDos.agregarHoja(componenteUno);
     componenteDos.agregarHoja(componenteTres);

      //muestra el costo del libro total
      System.out.println("el libro cuesta: " +componenteDos.getCosto());

 }
}
