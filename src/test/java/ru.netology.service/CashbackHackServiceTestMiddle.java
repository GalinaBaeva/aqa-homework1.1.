package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTestMiddle {

    @Test
    void shouldReturn499IfAmount501() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 501;
        int actual = cashbackHackService.remain(amount);
        int expected = 499;
        assertEquals(expected, actual);
    }
}