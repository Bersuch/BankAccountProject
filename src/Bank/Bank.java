package Bank;
import Person.Person;

public class Bank {
	
	private double amount = 0.0;
	private int iban;
	private Person person;
	
	public Bank(double amount) {
		this.amount = amount;
	}
	
	public Bank(Person person) {
		this.person = person;
	}
	
	public void setIBAN(int iban) {
		this.iban = iban;
	}
	
	private int getIban() {
		return this.iban;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setMoney(double money) {
		amount += money;
	}
	
	public void drawMoney(double money) {
		amount -= money;
	}
	
	public boolean moneyTransfer(Bank receiver, int iban, double money) {
		double pufferReceiver = money;
		double pufferSender = this.amount;
		
		//Check if given Iban exists
		if(receiver.getIban() == iban) {
			this.amount -= money;
			receiver.amount += money;
			
			//check if money was successfully transfered
			if(receiver.amount == pufferReceiver && this.amount == pufferSender) {
				System.out.println("Money was not transfered!");
				return true;
			} else {
				System.out.println("Money was transfered!");
				return false;
			}
		} else {
			System.out.println("Cannot find Person with given Iban!");
		}
		return true;
	}
	
	// Set everything to default;
	public void deleteAccount() {
		this.amount = 0.0;
		this.iban = 0;
		this.person = null;
	}
}