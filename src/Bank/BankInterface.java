package Bank;

import Account.Account;
import User.User;

public interface BankInterface {

	public String getNewUserUUID();
	
	public String getNewAccountUUID();
	
	public void addAccount(Account anAcct);
	
	public User addUser(String firstName, String lastName, String pin);
	
	public User userLoging(String userID, String pin);
	
	public String getName();
	
}
