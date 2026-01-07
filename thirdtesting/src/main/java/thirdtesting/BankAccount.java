package thirdtesting;

public class BankAccount {

    int balance = 5000;

    public int withdraw(int amount) {
        balance = balance - amount;
        return balance;
    }
}


