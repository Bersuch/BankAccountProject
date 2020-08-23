package Transaction;
import java.util.Date;

import Account.Account;

public class Transaction implements TransactionInterface{

	// The amount of this transaction.
	private double amount;
	
	// The time and date of this transaction
	private Date timestamp;
	
	// A memo for this transaction.
	private String memo;
	
	// The account in which the transaction was performed
	private Account inAccount;
	
	/**
	 * Create a new transaction
	 * @param amount	the amount transacted
	 * @param inAccount	the account the transaction belongs to
	 */
	public Transaction(double amount, Account inAccount) {
		
		this.amount = amount;
		this.inAccount = inAccount;
		this.timestamp = new Date();
		this.memo = "";
		
	}
	
	/**
	 * Create a new transaction
	 * @param amount	the amount transacted
	 * @param memo		the memo for the transaction
	 * @param inAccount	the account the transaction belongs to
	 */
	public Transaction(double amount, String memo, Account inAccount) {
		
		// call the two-arg contructor forst
		this(amount, inAccount);
		
		// set the memo
		this.memo = memo;
		
	}

	/**
	 * Return the balance amount
	 * @return	amount
	 */
	public double getAmount() {
		return this.amount;
	}
	
	/**
	 * Get a string summarizing the transaction
	 * @return	the summary String
	 */
	public String getSummaryLine() {
		if(this.amount >= 0) {
			return String.format("%s : €%.02f : %s", this.timestamp.toString(), 
						this.amount, this.memo);
		} else {
			return String.format("%s : €(%.02f) : %s", this.timestamp.toString(), 
					-this.amount, this.memo);
		}
	}
}