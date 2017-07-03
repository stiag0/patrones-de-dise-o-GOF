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
public class HasCard implements ATMState {
	
	ATMMachine atmMachine;
	
	public HasCard(ATMMachine newATMMachine){
		
		atmMachine = newATMMachine;
		
	}

	public void insertCard() {
		
		System.out.println("You can only insert one card at a time");
		
	}

	public void ejectCard() {
		
		System.out.println("Your card is ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
		
	}

	public void requestCash(int cashToWithdraw) {
		
		System.out.println("You have not entered your PIN");
		
		
	}

	public void insertPin(int pinEntered) {
		
		if(pinEntered == 1234){
			
			System.out.println("You entered the correct PIN");
			atmMachine.correctPinEntered = true;
			atmMachine.setATMState(atmMachine.getHasPin());
			
		} else {
			
			System.out.println("You entered the wrong PIN");
			atmMachine.correctPinEntered = false;
			System.out.println("Your card is ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
		}	
	}	
}
