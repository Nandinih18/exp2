package bank.ui;

import bank.entity.*;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount[] store = new BankAccount[3];
		store[0] = new BankAccount(1, "Nandini", 1000);
		store[1] = new BankAccount(2, "Nida", 1000);
		store[2] = new BankAccount(3, "Harika", 2000);

		store[0].addBalance(500);
		store[1].transferAmount(store[2], 600);

		BankAccountMain m = new BankAccountMain();
		m.print(store);
	}

	private void print(BankAccount[] c) {
		for (int i = 0; i < 3; i++) {
			System.out.println("id:" + c[i].getId() + "Name:" + c[i].getName() + "Balance:" + c[i].getBalance());
		}
	}

}
