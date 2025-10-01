// functionality-> implements deposit, withdraw, and balance management

class Account extends Bank{
    // constructor
    public Account(String accountName, double balance){
        super (accountName, balance);  //call parent constructor

    }
    // deposit method
    @Override
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;  //add amount to balance
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
            recordTransaction(accountName + "Deposited $" + amount + ". New balance: $" + balance);

        }else{
            System.out.println("Deposit amount must be greater than 0");
        }
    }

    // withdraw method
    @Override
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;  //subtract amount from balance
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
            recordTransaction(accountName + "Withdrawn $" + amount + ". New balance: $" + balance);
        }else{
            System.out.println("Withdrawal amount must be greater than 0 and less than or equal to balance");
        }
    }

    // get balance method
    @Override
    public double getBalance(){
        System.out.println("Current balance" + balance);
        recordTransaction(accountName + "Current balance" + balance);
        return balance;
    }
}