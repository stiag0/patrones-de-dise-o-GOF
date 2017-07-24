/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Benitez
 * @version 3.0
 * abstraccion que es implementada en las figuras 
 */
public abstract class Shape {
    //Composicion-implementador
    protected Color color;
    
    /**
     * constructor con el implementador como argumento de entrada
     * @Param Color c
     */
    public Shape(Color c){
        this.color = c;
    }
    
    abstract public void applyColor();
    
}
