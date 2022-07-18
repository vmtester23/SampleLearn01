package com.learnautomationonline.learning;

public class BankAccount {

	long AccNum=323233223;// long is a primitive data type
	Long AccountNumber;// Long is a wrapper class 
	String holderName="Vignesh";
	Integer accountBalance=45000;
	
	public void getBalance() {
		System.out.println("Balance is " +accountBalance);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount();
		acc.getBalance();
	}

}
