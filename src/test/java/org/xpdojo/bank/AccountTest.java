package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        Account account = new Account();
        account.deposit(10);
        assertThat(10).isEqualTo(account.balance().amount);

    }

    @Test
    public void depositAnAmountToIncreaseTheBalanceAndThenTransfer() {
        Account account = new Account();
        account.deposit(10);
        assertThat(10).isEqualTo(account.balance().amount);
        Account other = new Account();
        account.transferTo(other, 15);
        assertThat(10).isEqualTo(account.balance().amount);
        assertThat(0).isEqualTo(other.balance().amount);
        account.transferTo(other, 5);
        assertThat(5).isEqualTo(account.balance().amount);
        assertThat(5).isEqualTo(other.balance().amount);
        account.transferTo(other, 5);
        assertThat(0).isEqualTo(account.balance().amount);
        assertThat(10).isEqualTo(other.balance().amount);

    }


}
