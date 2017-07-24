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
public class Triangle extends Shape {
    
    public Triangle(Color c){
        super(c);
        
    }
    
    @Override
    public void applyColor(){
        System.out.print("Triangulo rellenado con color ");
        color.applyColor();
    }
    
}
