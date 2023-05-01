package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

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
        Assert.assertEquals(actual, expected);
    }
}
