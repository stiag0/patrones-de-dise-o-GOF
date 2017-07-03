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
public class ATMMachine {

    ATMState hasCard;     
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;
    
    ATMState atmState;
    
    int cashInMachine = 2000;
    
    boolean correctPinEntered = false;
    
    public ATMMachine(){
        
        hasCard = new HasCard(this);
	noCard = new NoCard(this);
	hasCorrectPin = new HasPin(this);
	atmOutOfMoney = new NoCash(this);
        
        atmState = noCard;
		
	if(cashInMachine <= 0){
            
            atmState = atmOutOfMoney;		
	}
    }
    
    void setATMState(ATMState newATMState){
        
        atmState = newATMState;
    
    }
    
    public void setCashInMachine(int newCashInMachine){
        
	cashInMachine = newCashInMachine;
    
    }
    
    public void insertCard() {
	
        atmState.insertCard();
        
    }
    
    public void ejectCard() {
		
        atmState.ejectCard();
               
    }
    
    public void requestCash(int cashToWithdraw) {
		
	atmState.requestCash(cashToWithdraw);
        
    }
    
    public void insertPin(int pinEntered){
	
        atmState.insertPin(pinEntered);		
    
    }
    
    public ATMState getYesCardState() { return hasCard; }
    public ATMState getNoCardState() { return noCard; }
    public ATMState getHasPin() { return hasCorrectPin; }
    public ATMState getNoCashState() { return atmOutOfMoney; }
    
}