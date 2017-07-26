/**
* clase Creador la cual se encarga de crear los objetos o clases Archivo... con un switchcase
*
*
*/

public class Creador extends CreadorAbstracto
{
    public void Creador() {
    }
    /*
    * metodo crear el cual retorna una clase IArchivo dependiendo de un switchcase
    *
    * @retunt IArchivo retorna una objeto
    */
    @Override
     public IArchivo crear(int tipo)
    {
        IArchivo objeto;
        switch( tipo )
        {
            case AUDIO:
                objeto = new ArchivoAudio();
                break;
            case VIDEO:
                objeto = new ArchivoVideo();
                break;
            default:
                objeto = null;
        }
        return objeto;
    }
}
