package User;

import Account.Account;
import Bank.Bank;

public interface UserInterface {
	
	public void addAccount(Account anAcct);
	
	public String getUUID();
	
	public String getFirstName();

	public boolean validatePin(String aPin);
	
	public void printAccountsSummary();
	
	public int numAccounts();
	
	public void printAcctTransHistory(int acctIdx);
	
	public double getAcctBalance(int acctIdx);
	
	public double getAcctUUID(int acctIdx);
	
	public void addAcctTransaction(int acctIdx, double amount, String memo);
}
