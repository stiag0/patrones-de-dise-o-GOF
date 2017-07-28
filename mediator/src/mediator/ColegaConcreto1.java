package mediator;

/**
* clase ColegaConcreto1 la cual implementa clase Colega
*
*/
public class ColegaConcreto1 extends Colega
{
    public ColegaConcreto1(IMediador m) {
        this.setMediador( m ); //asigna el mediador
    }
    /**
    * metodo recibir recibe un mensaje para mostrarlo
    * @parm String mensaje a mostrar
    */
    @Override
     public void recibir(String mensaje)
    {
        System.out.println( "ColegaConcreto1: " + mensaje );
    }
}
