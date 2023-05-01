package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturnZeroIfAmountIsDivisibleBy1000() {
        // arrange
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        // act
        int actual = service.remain(amount);

        // assert
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}
