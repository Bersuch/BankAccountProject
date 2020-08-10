import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import Bank.Bank;
import Person.Person;

public class Main {

	public static void main(String[] args) {
		
		// ToDo: Find good Datastructure like [Bank, Iban] -> [Bank1, 123]
		Map<String, Integer> liste = new HashMap<String, Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Example Bank!");
		menu();
		liste.put("Test", 2);
		System.out.println(liste.toString());
		while(input.hasNext()) {
		if(input.nextLine().contains("create")) {
			System.out.print("Enter Name: ");
			String name = input.nextLine();
			if(name.length() == 0) {
				System.out.println("Enter your Name please: ");
				continue;
			}
			System.out.print("Enter Surname: ");
			String surname = input.next();
			if(surname.length() == 0) {
				System.out.println("Enter your Name please: ");
				continue;
			}
			System.out.print("How much money you want to deposit? (Hint: type '.' as a comma): ");
			String deposit = input.next();
			double balance;
			if(deposit.length() == 0) {
				System.out.println("Empty or Not a Number");
				continue;
			} else {
				balance = Double.parseDouble(deposit);
				System.out.println("Money successfully deposit. Balance: " + balance);
			}
			Person person = new Person(name, surname);
			Bank bank = new Bank(person, balance);
			Random rand = new Random();
			int iban = rand.nextInt(1000) + 1;
			System.out.println("Name: " + name + ", Surname: " + surname + ", Iban: " + iban + ", Balance: " + balance);
			
			//ToDo: Add Object with given Iban to list 
			
			
		} else {
			
			//ToDo: Should not Print when typed command is correct 
				System.out.println("Didn't understand what you said.");
			}
		}
		
		
		
	}
	
	public static void menu() {
		System.out.println("");
		System.out.println("create:\t\t\t\tCreate a Bank Account with Personal Data");
		System.out.println("withdraw 'Iban' '123.0':\tWithdraw money from Bankaccount");
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