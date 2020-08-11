import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import Bank.Bank;
import Person.Person;

public class Main {

	public static void main(String[] args) {

		boolean check = true;
		
		int MAX = 124567;

		// ToDo: Find good Datastructure like [Bank, Iban] -> [Bank1, 123]+
		int bankStored = 0;
		Bank[] liste = new Bank[100];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Example Bank!");
		menu();

		while (true) { // Condition in while loop is always true here
			if(input.nextLine().contains("create")) {
				
				System.out.print("Enter your Name: ");
				String name = input.nextLine();
				if (name.equals("")) {
					System.out.println("Empty. Try again!");
					continue;
				}
				
				System.out.print("Enter your Surname: ");
				String surname = input.nextLine();
				if (surname.equals("")) {
					System.out.println("Empty. Try again!");
					continue;
				}
				
				System.out.print("How much money you want to deposit?: ");
				double balance = 0.0;
				String money = input.nextLine();
				
				if(money.equals("")) {
					System.out.println("Empty. Try again!");
					continue;
				} else if(Double.parseDouble(money) <= 0.0) {
					System.out.println("Money should be greater than Zero");
					continue;
				}
				
				balance = Double.parseDouble(money);
				
				Person person = new Person(name, surname);
				Bank bank = new Bank(person, balance);
				Random rand = new Random();
				int iban = rand.nextInt(1000) + 1;
				System.out.println("Your Account: [Name: " + name + ", Surname: " + surname + ", Iban: " + iban + ", Balance: " + balance + "]");
				liste[bankStored++] = bank;
				
				
				


			} else {
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