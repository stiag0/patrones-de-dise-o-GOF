/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Benitez
 * @version 
 * Clase Observadora Binaria 
 */
public class BinObserver extends Observer {
    
    public BinObserver(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }
    
    public void update(){
        System.out.println(" " + Integer.toBinaryString(subject.getState()));
    }
    
}
