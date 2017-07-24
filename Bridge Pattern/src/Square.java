/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flio0
 */
public class Square extends Shape {
    
    public Square(Color c){
        super(c);
    }
    
    @Override
    public void applyColor(){
        System.out.print("Cuadrado rellenado con color ");
        color.applyColor();
    }
    
}
