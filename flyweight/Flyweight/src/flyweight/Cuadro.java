/*
    las lineas que debes comentar para usar el flyweight son:
    Linea 26
    Linea 36 hasta 54
 */
package flyweight;

import java.awt.*;
import java.util.Random;
/**
 *
 * @author stiag
 */


public class Cuadro {    
    
    //las posiciciones
    Random rand = new Random();
    private int x,y;
    
    public Cuadro (){
        x = rand.nextInt(1080);
        y = rand.nextInt(700);
        int k = rand.nextInt(8);
        color = shapeColor[k];
    }
    public int getPosX(){
    return x;
    }
    public int getPosY(){
    return y;
    }
    
    //color
    
    Color[] shapeColor = {Color.orange, Color.red, Color.yellow,
    Color.blue, Color.pink, Color.cyan, Color.magenta,
    Color.black, Color.gray};
    
    Color color;
    
    //tamaño
    private int H=20;
    
    
    public int getTamaño(){
    return H;
    }
    
    public Color getColor(){
    return color;
    }
    
}
