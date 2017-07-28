/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
* clase ColegaConcreto2 la cual implementa clase Colega
*
*/
public class ColegaConcreto2 extends Colega
{
    public ColegaConcreto2(IMediador m) {
        this.setMediador( m ); //asigna el mediador
    }
    /**
    * metodo recibir recibe un mensaje para mostrarlo
    * @parm String mensaje a mostrar
    */
    @Override
     public void recibir(String mensaje)
    {
        System.out.println( "ColegaConcreto2: " + mensaje );
    }
}

