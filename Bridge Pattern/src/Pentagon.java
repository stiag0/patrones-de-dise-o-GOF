/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Benitez
 * @version 3.0
 */
public class Pentagon extends Shape {
    /**
     * constructor de la clase pentagono
     * @param c : pide un color para la implementacion 
     * 
     */
    public Pentagon(Color c){
        super(c);
    }
    
    @Override
    public void applyColor(){
        System.out.print("Pentagono rellenado con color ");
    }
}
