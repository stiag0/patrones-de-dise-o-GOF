package singleton;

/*
    este es es el main
*/

/**
 *
 * @author stiago
 */

public class Singleton {
    
    //este metodo nos dira si podemos enviar o no nuestro pedido
    //(deja este pedaso para lo ultimo)
    public static void enviar (Pedido a){
        if (a.getProductos().length()>1) {
            Despacho f = Despacho.getInstance();
            if (f.getEstado().equals("Disponible")) {
                System.out.println("El pedido ya esta en camino");
            }else{
                System.out.println("Despachos no disponibles");
            }
        }else{
            System.out.println("no hay nada que enviar");
        }
    }
    
    public static void main(String[] args) {
        
        //vamos a generara un nuevo pedido 
        Pedido pedidoUno = new Pedido();
        //le agregamos unos cuantos productos
        pedidoUno.AddProduct("gato Relog");
        pedidoUno.AddProduct("mesa flotate");
        pedidoUno.AddProduct("matera de acedio");
        pedidoUno.AddProduct("cuchillo con mira");
        //verificamos que todo edte bien
        System.out.println(pedidoUno.getProductos());
        System.out.println(pedidoUno.getTotal()); 
        // ya que vimos que todo esta en orden y tenemos todo listo para enviar nuestro
        // pedido vamos a despacharlo
        enviar(pedidoUno);
        //como podemos ver no podemos enviar nuestro pedido aun, así que 
        //descomenta el codigo (SOLO el codigo) que esta abajo para que funcione
        
        
        /*
          instanciamos el objeto
        */
        
        //Despacho logerUno = Despacho.getInstance();
        
        //System.out.println(logerUno.getEstado());
        
        /*
         creamos uno NUEVO para demostrarr que no importa
         cuantos hagamos, todos son el mismo singleton
        */
        
        //Despacho logerDos = Despacho.getInstance();
        
        /*
         aqui modificamos el estado del logerDos
        */
        
        // logerDos.setEstado("soyLaClave");

        /*
         Pero como no importa cuantas isntancias haga, todas 
         son una referencia del primero, voy a pedir el estado 
         de la primera instancia que hice.
        */
        
        // System.out.println(logerUno.getEstado());

        /*
          ya podemos enviar nuestro pedido
        */
        
        // enviar(pedidoUno);
    }
    
}
