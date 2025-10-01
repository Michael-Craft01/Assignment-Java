// abstract base class that defines the structure of a bank

import java.io. *;
import java.util.*;

abstract class Bank{
    // state-> dsta members
    protected String accountName;
    protected double balance;

    public Bank(String accountName, double balance){
        this.accountName = accountName;
        this.balance = balance;
    }

    // Abstract methods (must be implememnted by subclasses)
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // helper method to record transactions in Bank.txt
    protected void recordTransaction (String message){
        try{
            FileWriter writer = new FileWriter("Bank.txt", true);
            writer.write(message + "\n");
            writer.close();
        }catch (IOException e){
            System.out.println("Error writing to file: "+ e.getMessage());
        }
    }
}