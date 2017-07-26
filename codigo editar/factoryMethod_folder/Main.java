/*
* ejemplo del patron Factory method
*
* este patron se basa en definir una clase abstracta sin definir exactamente como es
* siendo las subclases las que se encargen de definir
*
* en este ejemplo se crea la clase CreadorAbstracto y Creador las cuales se encargan de crear Archivos de pendiendo de un switchcase
*
*
*/
public class Main
{
    public static void main(String[] args)
    {
        CreadorAbstracto creator = new Creador();
        IArchivo audio = creator.crear( Creador.AUDIO ); //define el tipo de archivo AUDIO = 1
        audio.reproducir();
        IArchivo video = creator.crear( Creador.VIDEO ); //define el tipo de archivo VIDEO = 2
        video.reproducir();
    }
}
