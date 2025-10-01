// File: AccountTest.java
// Functionality: Tests the Account class methods

public class AccountTest {
    public static void main(String[] args) {
        // Create a new account with initial balance
        Account myAccount = new Account("Michael", 5000);

        // Test deposit
        myAccount.deposit(1000);   // Valid
        myAccount.deposit(-50);    // Invalid

        // Test withdraw
        myAccount.withdraw(2000);  // Valid
        myAccount.withdraw(10000); // Invalid (exceeds balance)

        // Test balance
        myAccount.getBalance();
    }
}
