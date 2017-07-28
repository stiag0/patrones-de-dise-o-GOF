/**
* Clase CreadorAbstracto la cual posee los tipos de archivos y el metodo crear
* esta es una clase abstracta
*
*/
public abstract class CreadorAbstracto
{
    public static final int AUDIO = 1;
    public static final int VIDEO = 2;
    
     public abstract IArchivo crear(int tipo);
}
