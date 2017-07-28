package mediator;

import java.util.ArrayList;
/**
* clase mediator  es la encargada de la mediacion entre la clasee Colega y sus subclases
*
* esta implementa la clase IMediator
*/
public class Mediador implements IMediador
{
    private ArrayList<Colega> colegas; //ArrayList de colegas

    public Mediador()
    {
        this.colegas = new ArrayList<Colega>();
    }

    /**
    * metodo agregarColega  agrega Colega al array list
    *
    * @parm Colega  colega para agregar
    */
    public void agregarColega(Colega colega)
    {
        this.colegas.add( colega );
    }

    /**
    * metodo enviar envia un string a un Colega especifico
    *
    * @parm String mensaje a enviar
    * @parm Colega colega al que no se le quiere enviar el mensaje
    *
    */
    @Override
    public void enviar(String mensaje, Colega originator)
    {
        for( Colega colega : colegas )
        {
            if( colega != originator )
            {
                colega.recibir( mensaje );
            }
        }
    }
}
