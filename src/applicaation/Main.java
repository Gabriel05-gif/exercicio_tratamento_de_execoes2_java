package applicaation;

import java.util.Scanner;

import model.entities.Account;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira os dados da conta: ");
		System.out.print("Numero da conta: ");
		int number = sc.nextInt();
		System.out.print("Nome do titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();

		Account account = new Account(number, holder, balance, withdrawLimit);

		System.out.println();
		System.out.print("Insira a quantia para saque: ");

		double amount = sc.nextDouble();

		try {
			account.withdraw(amount);
			System.out.println("Saldo atual: " + String.format("%.2f", account.getBalance()));
		} 
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}


		sc.close();
	}

}
