package simple.objects;

public class BankAccount {

    //instance variables
    //balance, interest rate, account #, routing #, account holder(name)
    private String name;
    private int accountNumber;
    private int routingNumber;
    private double interestRate;
    private double balance;

    //constructors
    public BankAccount(){
        //default constructor
    }

    public BankAccount (String name, int accountNumber, int routingNumber, double interestRate, double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
        this.routingNumber = routingNumber;
    }

    public BankAccount (String name, int accountNumber, int routingNumber, double interestRate){
        this.accountNumber = accountNumber;
        this.name = name;
        this.interestRate = interestRate;
        this.routingNumber = routingNumber;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    //toString Method
    public String toString(){
        return "Name: " + name + " || Balance: " + balance + " || Interest Rate: " + interestRate + " || Account Number: " + accountNumber + " || Routing Number: " + routingNumber;
    }

    //Custom Methods
    public void deposit (int amount){
        balance += amount;
    }
    public void  withdraw (int amount){
        balance -= amount;
    }
}
