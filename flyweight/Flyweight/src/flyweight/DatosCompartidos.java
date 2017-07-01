/*
    aqui lo que hay son datos que todas las instancias comparten
    IMPORTANTE: en este caso como los cuadros solo compartian una variable entera (es muy poco)
    los puse tambien a compartir el color, para que se notara la diferencia
    en el peso del programa final.
    si quieres puedes hacer que solo compartan el tamaño, siguiendo estos pasos 
    
    1.comentando las siguentes lineas:
    
    Linea 23 hasta 29
    Linea 38
    Linea 43 hasta 46
    
    2. En Flyweight.java cambia la siguiente linea
    Linea 95
    cambia  g.setColor(tam.getColor());
    por     g.setColor(cuadros[i].getColor());
    
    3. En Cuadro.java asegurate de que estas lineas NO esten comentadas
    Linea 26
    Linea 36 hasta 42
    Linea 50 hasta 54
 */
package flyweight;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author stiag
 */
public class DatosCompartidos {
    
    Random rand = new Random();
    //color
    
    Color[] shapeColor = {Color.orange, Color.red, Color.yellow,
    Color.blue, Color.pink, Color.cyan, Color.magenta,
    Color.black, Color.gray};
    
    Color color;

    private int H;
    
    public DatosCompartidos (){
        H = 20;
        
        int k = rand.nextInt(8);
        color = shapeColor[k];
    }
    public int getTamaño(){
        return H;
    }
    
    public Color getColor(){
        return color;
    }
}
