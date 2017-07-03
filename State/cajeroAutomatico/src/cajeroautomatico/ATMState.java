/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomatico;

/**
 *
 * @author stiag
 */
public interface ATMState {
    
    // Different states expected
    // HasCard, NoCard, HasPin, NoCash
	
    void insertCard();
        
    void ejectCard();
	
    void insertPin(int pinEntered);
	
    void requestCash(int cashToWithdraw);
	
}
