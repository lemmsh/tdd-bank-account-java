package org.xpdojo.bank;

import java.util.LinkedList;
import java.util.Optional;

public class Account {
    private LinkedList<Money> ledger = new LinkedList<>();

    public void deposit(int amount) {
        if (amount > 0) {
            ledger.add(new Money(amount));
        }
    }

    public Optional<Money> withdraw(int amount) {
        Money e = new Money(-1 * amount);
        if (balance().amount >= amount) {
            ledger.add(e);
            return Optional.of(new Money(amount));
        } else {
            return Optional.empty();
        }
    }

    public Money balance() {
        return ledger.stream().reduce(new Money(0), (a, b) -> new Money(a.amount + b.amount));
    }

    public void transferTo(Account other, int amount) {
        withdraw(amount).map(m -> {
            other.deposit(m.amount);
            return m;
        });
    }

}
