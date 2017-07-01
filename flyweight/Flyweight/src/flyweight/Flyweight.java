/*
    Este es el main y la interfaz grafica del programa
 */
package flyweight;
/*
    importamos las bibliotecas para dibujar
*/
import java.awt.BorderLayout;

import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author stiago
 */
public class Flyweight extends JFrame{

    JButton boton;
    
    int anchoPantalla = 1080;
    int largoPantalla = 700;
    
    // si tu computador tiene las especificaciones de una papa
    // te recomiendo que reduscas el numero de esta variable ; Son 8 segundos
    // aproximadamente lo que deberia tomar en ejecutandose este programa.
    int numIns = 1000000;
    
    /*
        vamos a generar un gran numero de cuadrados y guardarlos en este arreglo
    */
    Cuadro cuadros[] = new Cuadro[numIns];
    
    public static void main(String[] args) {
        
        new Flyweight();
        
    }
    
    public Flyweight(){
        
        this.setSize(anchoPantalla,largoPantalla);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ejemplo Flyweight");
        
        JPanel contenedor = new JPanel();
        contenedor.setLayout(new BorderLayout());
        
        final JPanel  panelDeDibujo  = new JPanel();
        
        boton = new JButton("Dibuja cosas");
        
        contenedor.add(panelDeDibujo,  BorderLayout.CENTER);     
        contenedor.add(boton,  BorderLayout.SOUTH);
        
        boton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent evento) {
                
                Graphics g = panelDeDibujo.getGraphics();
                
                long startTime = System.currentTimeMillis();
                
                DatosCompartidos tam = new DatosCompartidos();
                
                //los guardamos, esto es mas para justificar por que los creamos que los creamos
                for (int i = 0; i < numIns; i++) {
                    
                    Cuadro a = new Cuadro();
                    
                    cuadros[i] = a;
                }
                //aqui si los imprimimos
                for (int i=0;i<numIns;i++){
                    
                    //sin flyweight
                    
                    g.setColor(cuadros[i].getColor());
                    g.fillRect(cuadros[i].getPosX(),cuadros[i].getPosY(),
                    cuadros[i].getTamaño(),cuadros[i].getTamaño());
                    
                    
                    /*
                        para mostrar como funciona con flyweight descomenta el siguiente codigo
                        tambien ve a la clase Cuadro.java y comenta las lineas que alli se te indica
                        y por ultimo comenta las 3 lineas de codigo que estan debajo de "//sin flyweight"
                    */ 
                    //con flyweight
                    /*
                    g.setColor(tam.getColor());
                    g.fillRect(cuadros[i].getPosX(),cuadros[i].getPosY(),
                    tam.getTamaño(),tam.getTamaño());
                    */
                }
                 
                
                
                long endTime = System.currentTimeMillis();
                System.out.println("esto se demoro : "+(endTime-startTime)+" milisegundos");
                
                /*
                    Recuerda que el Flyweight no reduce tanto el tiempo de ejecucion,
                    lo que si hace es reducir el consumo de memoria, ya que los datos 
                    que se repiten en muchas instancias se dejan a parte 
                    en un objeto que solo se instancie una vez y de alli sacamos datos
                    
                */
                
            }
        });
        this.add(contenedor);
        this.setVisible(true);

    }
    
}
