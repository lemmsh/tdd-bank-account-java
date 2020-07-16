package org.xpdojo.bank;

public class Account {
    private Money balance = new Money(0);

    public Money deposit(int amount) {
        balance = balance.add(amount);
        return balance;
    }
    public Money balance() {
        return balance;
    }

}
