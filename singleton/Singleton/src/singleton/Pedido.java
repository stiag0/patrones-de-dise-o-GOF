/*
    Esta clase es desde donde manejamos los Pedido, no es muy importante

 */

package singleton;
import java.util.Random;
import java.util.ArrayList;
/**
 * @author stiago
 */
public class Pedido {
    private int idPedido;
    private ArrayList productos = new  ArrayList();
    private int totalPedido = 0;
    private Pedido Ped;
    
    public Pedido (){
        idPedido++;
    }
    public int getIdPedido(){
        return idPedido;
    }
    public int getTotal (){
        return totalPedido;
    }
    public void AddProduct (String prod){
    
        productos.add(prod);
        
        //solo ignoren como le pongo precio a estos productos
        //esto solo para tener un numero
        Random rand = new Random();
        int n = rand.nextInt(10000) + 1;
        totalPedido = totalPedido + n;
    }
    public String getProductos (){
        String str ="";
        for(int i=0;i<productos.size();i++){
            str = str +','+productos.get(i);
        }
        return str;
    }
}
