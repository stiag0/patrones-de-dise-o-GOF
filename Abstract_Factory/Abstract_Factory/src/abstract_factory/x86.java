/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory;

/**
 *
 * @author sorti
 */
public class x86 implements Arquitectura {
   @Override
   public void startup() {
      System.out.println("32 bits::startup() method.");
   }
}