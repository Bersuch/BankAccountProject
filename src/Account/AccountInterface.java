package Account;

public interface AccountInterface {
	
	public String getUUID();
	
	public String getSummaryLine();
	
	public double getBalance();
	
	public void printTransHistory();
	
	public void addTransaction(double amount, String memo);

}
