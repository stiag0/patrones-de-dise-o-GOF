/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

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
