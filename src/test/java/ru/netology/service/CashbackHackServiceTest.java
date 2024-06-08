package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnIfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnIfAmount900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnIfAmount1100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;

        int actual = cashbackHackService.remain(amount);
        int expected = 900;
        Assert.assertEquals(actual, expected);
    }
}