/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Benitez 
 * @version 1.0
 * Clase "Sujeto" esta conectadad a los demas observadores 
 */
import java.util.*;
        
        
public class Subject {
    
    private List<Observer>observers = new ArrayList<>();
    private int state;
    
    /**
     * Metodo para la adicion de observadores a la lista de observadores 
     * @param o 
     */
    public void add(Observer o){
        observers.add(o);
    }
    
    public int getState(){
        return state;
    }
    
    public void setState(int value){
        this.state=value;
        execute();
    }
    
    private void execute(){
        for (Observer observer : observers){
            observer.update();
        }
    }
    
}
