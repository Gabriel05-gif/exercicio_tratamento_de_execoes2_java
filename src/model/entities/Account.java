package model.entities;

public class Account {

	// Attributes
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	// Constructors
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	// Methods get and set
	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	// Methods withdraw and deposit
	public void deposit(double balance) {
		this.balance += balance;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}
}
