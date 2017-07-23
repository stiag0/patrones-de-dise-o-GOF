/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Benitez
 * @version 1.0
 * clase observador Hexadecimal
 */
public class HexObserver extends Observer {
    
    public HexObserver(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }
    
    public void update(){
        System.out.println(" " + Integer.toHexString(subject.getState()));
    }
    
}
