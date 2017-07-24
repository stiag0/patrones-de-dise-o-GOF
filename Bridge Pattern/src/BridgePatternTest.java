/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flio0
 */
public class BridgePatternTest {
    
    public static void main(String[] args){
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();
        
        //Shape pent = new Pentagon(new GreenColor());
        //pent.applyColor();
        
        Shape squ = new Square(new GreenColor());
        squ.applyColor();
    }
    
}
