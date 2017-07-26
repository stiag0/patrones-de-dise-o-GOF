/**
* clase ArchivoVideo implementa de la clase IArchivo
*
*
*/
public class ArchivoVideo implements IArchivo
{
    public ArchivoVideo() {
    }
    
    @Override
     public void reproducir() {
        System.out.println("Reproduciendo archivo de vídeo...");
    }
}
