package bank.entity;

public class BankAccount {
	private int id;
	private String name;
	private double balance;
	
	public BankAccount() {
	}
	
	public BankAccount(int id,String name,double balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public void addBalance(double amount) {
		balance=balance+amount;
	}
	
	public void transferAmount(BankAccount b,double amount) {
		if(balance>amount) {
			balance=balance-amount;
			b.balance=b.balance+amount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}

}
