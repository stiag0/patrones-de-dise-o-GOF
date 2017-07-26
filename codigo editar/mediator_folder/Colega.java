/**
* clase Colega es una clase abstracta
*
*/
public abstract class Colega
{
    protected IMediador mediador;
    /**
    * metodo getMediator retorna el mediador entre la clase y sus subclases
    */
    public IMediador getMediador()
    {
        return this.mediador;
    }
    /**
    * metodo setMediator asigna un mediador para la clase
    */
    public void setMediador( IMediador m )
    {
        this.mediador = m;
    }
    /*
    * metodo comunicar envia un string por el metodo enviar del mediator
    * @parm String mensaje a enviar
    */
     public void comunicar(String mensaje)
    {
        this.getMediador().enviar(mensaje, this);
    }
    // Método a implementar por las clases que hereden
     public abstract void recibir(String mensaje);
}
