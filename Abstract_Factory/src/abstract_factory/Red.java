/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory;

public class Red implements Color {

   @Override
   public void fill() {
      System.out.println("Dentro de Red::fill()");
   }
}