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


}
