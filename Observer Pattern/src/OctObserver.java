/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Benitez
 * @version 1.0
 * clase observadora Octodecimal
 */

import java.util.*;

public class OctObserver extends Observer {
    
    public OctObserver(Subject subject){
      this.subject = subject;
      this.subject.add(this);
    }
    
    public void update(){
        System.out.println(" " + Integer.toOctalString(subject.getState()));
    }
    
}
