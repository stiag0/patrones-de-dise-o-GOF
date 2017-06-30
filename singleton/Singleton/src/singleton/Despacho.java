
package singleton;
//                         ESTE ES EL !SINGLETON!
/**
 *
 * @author stiago
 */
public class Despacho {
    
    private String estado ="No Disponible";
    private static Despacho Des;
    
    
    //limitamos a que solo se cree una instancia del objeto
    //puedes usar !!! public static synchronized !!! para trabajar en hilos sin problemas
    public static Despacho getInstance() {
        //pregunto por si el objeto aun no esta creado y si es el caso lo creo.
        if (Des == null) {
            Des = new Despacho();
        }
        return Des;
    }
    public void setEstado (String pass){
        if(pass.equals("soyLaClave")){
            //no se la digas a nadie :v
            
            if (estado.equals("No Disponible")) {
                estado ="Disponible";
            }else{
                estado ="No Disponible";
            }
            
        }
        
    }
    public String getEstado (){
        return estado;
    }
    
    //hacemos el constructor privado para que no terminen creado 
    //instancias no deceadas de este objeto.
    private  Despacho(){
        
    }
    
}
