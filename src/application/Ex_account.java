package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class Ex_account {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
			
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter account data");
			System.out.print("Number:");
			Integer number = sc.nextInt();
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Initial balance:");
			Double balance= sc.nextDouble();
			System.out.print("Withdraw Limit:");
			Double withdrawLimit= sc.nextDouble();
			Account acc = new Account(number,name,balance, withdrawLimit);
			System.out.print("Enter amount for withdraw:");
			Double amount= sc.nextDouble();
			acc.withdraw(amount);
			System.out.println(acc);
			sc.close();
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected Error!");
		}

	}

}
