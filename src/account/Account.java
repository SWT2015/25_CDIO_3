package account;

public class Account {

	private int balance;
	boolean negativeBalance;

	/**
	 * 
	 * @param balance
	 */
	public Account(int balance){
		setBalance(balance);
	}
	/**
	 * Sets balance to new balance. 
	 * Accepts input integer.
	 * If balance below zero, then balance equals zero.
	 * @param balance
	 */
	public void setBalance(int balance){
		if(balance < 0){
			negativeBalance=true;
			this.balance = 0;
		}
		else{
			this.balance = balance;
		}
	}
	
	public void adjustBalance(int dif){
		balance += dif;
		if(balance < 0){
			negativeBalance=true;
			balance = 0;
		}
	}
	
	public int getBalance(){
		return balance;
	}

	public boolean hasNegativeBalance(){
		return negativeBalance;
	}
	
}
