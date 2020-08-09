import java.util.Scanner;

import Bank.Bank;
import Person.Person;

public class Main {

	public static void main(String[] args) {
		
		Bank[][] array = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Example Bank!");
		
		menu();
		
		
		
		
	}
	
	public static void menu() {
		System.out.println("");
		System.out.println("create:\t\t\t\tCreate a Bank Account with Personal Data");
		System.out.println("withdraw 'Iban' '123.0':\tWithdraw money from Bankaccout");
		System.out.println("deposit 'Iban' '123.0':\t\tDeposit money to your Bankaccount");
		System.out.println("info [-a or --account]:\t\tPrint information about a Account");
		System.out.println("info [-p or --personal]:\tPrint Personal Data");
		System.out.println("info [-e or --everyting]:\tPrint everything 'Include Account and Profile'");
		System.out.println("delete [-a or --account]:\tDelete specific account");
		System.out.println("delete [-p or --personal]:\tDelete specific proile");
		System.out.println("exit:\t\t\t\tExit Program");
		System.out.println("");
	}
}