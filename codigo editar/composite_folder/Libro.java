public class Libro extends AbstractCompositor {
 private int costo = 0;  //costo del libro
 private List<AbstractCompositor> listaComposicion; //lista de AbstractCompositor
 /**
  * constructor de la clase libro
  */
 public Libro (){
  listaComposicion = new ArrayList<AbstractCompositor>();
 }

 /**
  * metodo el cual retorna el costo del libro
  *
  * @return int costo
  */
 @Override
 public int getCosto() {
  return this.costo;
 }

 /**
  *  metodo el cual agrega las hojas al libro
  * @param composicion
  */
 public void agregarHoja(AbstractCompositor composicion){
  this.costo = this.costo + composicion.getCosto(); //se obtiene el valor del costo de la hoja y se suma
  this.listaComposicion.add(composicion); //se agrega la hoja a la lista
 }
}
