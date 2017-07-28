package composite;

public class Hoja extends AbstractCompositor {

 private int costo;  //costo por hoja

 /*
 * constructor de la clase
 */
 public Hoja(int costo){
  this.costo = costo;
 }

 @Override
 /*
 *
 * @return int costo
 */
 public int getCosto() {
  return this.costo;
 }

 /*
 * se agrega el metodo ya que implementa AbstractCompositor
 */
 @Override
 public void agregarHoja(AbstractCompositor composicion) {
  // metodo no se usa
 }
}
