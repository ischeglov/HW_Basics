package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnIfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnIfAmount900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIfAmount1100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;

        int expected = 900;
        int actual = cashbackHackService.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}