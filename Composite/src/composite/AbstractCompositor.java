/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/*
*  clase de metodos abstractos
*/
public abstract class AbstractCompositor {
   public abstract int getCosto();
   public abstract void agregarHoja(AbstractCompositor composicion);
}
