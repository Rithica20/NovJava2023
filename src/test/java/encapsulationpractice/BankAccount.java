package encapsulationpractice;

public class BankAccount {
    /**
     * Assignment 2:
     * Objective: The objective of this assignment is to create a class that uses encapsulation to hide its implementation details and provide a simple interface for clients.
     * Instructions:
     * Create a class called "BankAccount" with the following private attributes: accountNumber (StringTest), balance (double), and owner (StringTest).
     * Create getter and setter methods for each attribute.
     * Write a method called "deposit" that takes a double parameter and adds it to the balance.
     * Write a method called "withdraw" that takes a double parameter and subtracts it from the balance.
     * Write a method called "printStatement" that prints out the account number, owner name, and balance.
     * Create an instance of the "BankAccount" class and set its attributes using the setter methods.
     * Call the "deposit" and "withdraw" methods to modify the balance of the account.
     * Call the "printStatement" method to verify that the data was set correctly.
     */

    private String accountNumber;
    private double balance;
    private String owner;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void deposit(double amount){
//      double total = amount+balance;
      balance = amount+balance;
    }
    public void withDraw(double amount){
//        double total = amount-balance;
        balance = balance-amount;
    }
    public void printStatement(){
        System.out.println(owner);
        System.out.println(accountNumber);
        System.out.println(balance);
    }
}
