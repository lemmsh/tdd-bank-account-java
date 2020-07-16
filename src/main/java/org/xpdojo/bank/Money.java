package org.xpdojo.bank;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {
    public final int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add(int amount) {
        return new Money(this.amount + amount);
    }
}
