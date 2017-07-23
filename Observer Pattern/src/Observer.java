/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Benitez
 * @version 1.0
 * Clase abstracta Observer 
 */
public abstract class Observer {
    
    protected Subject subject;
    public abstract void update();
    
}
