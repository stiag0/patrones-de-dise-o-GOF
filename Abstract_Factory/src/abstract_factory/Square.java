/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory;

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Dentro de Square::draw()");
   }
}