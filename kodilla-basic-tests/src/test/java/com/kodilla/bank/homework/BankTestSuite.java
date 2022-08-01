package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    Bank bank = new Bank("SuperBank");

    @Test
    public void shouldHaveZeroLength(){
        CashMachine [] cashMachines = bank.getCashMachines();

        assertEquals(0, cashMachines.length);
    }

    @Test
    public void shouldCalculateBalance(){
        CashMachine KRA444 = new CashMachine("KRA444");
        KRA444.addTransaction(10);
        KRA444.addTransaction(-5);
        CashMachine RZ21 = new CashMachine("RZ21");
        RZ21.addTransaction(15.5);
        RZ21.addTransaction(-5.2);

        bank.addCashMachine(KRA444);
        bank.addCashMachine(RZ21);

        assertEquals(15.3,bank.getTotalBalance(),0.00001);
    }

    @Test
    public void shouldCountNegative(){
        CashMachine KRA444 = new CashMachine("KRA444");
        KRA444.addTransaction(10);
        KRA444.addTransaction(-5);
        CashMachine RZ21 = new CashMachine("RZ21");
        RZ21.addTransaction(15.5);
        RZ21.addTransaction(-5.2);

        bank.addCashMachine(KRA444);
        bank.addCashMachine(RZ21);

        assertEquals(2,bank.getTotalNegativeCounter());
    }

    @Test
    public void shouldCountPositive(){
        CashMachine KRA444 = new CashMachine("KRA444");
        KRA444.addTransaction(10);
        KRA444.addTransaction(-5);
        CashMachine RZ21 = new CashMachine("RZ21");
        RZ21.addTransaction(15.5);
        RZ21.addTransaction(-5.2);
        RZ21.addTransaction(5);

        bank.addCashMachine(KRA444);
        bank.addCashMachine(RZ21);

        assertEquals(3,bank.getTotalPositiveCounter());
    }

    @Test
    public void shouldCalculateAvgPositive(){
        CashMachine KRA444 = new CashMachine("KRA444");
        KRA444.addTransaction(10);
        KRA444.addTransaction(-5);
        CashMachine RZ21 = new CashMachine("RZ21");
        RZ21.addTransaction(15.5);
        RZ21.addTransaction(-5.2);
        RZ21.addTransaction(5);

        bank.addCashMachine(KRA444);
        bank.addCashMachine(RZ21);

        assertEquals(10.1666666,bank.getAvgPositive(),0.001);
    }

    @Test
    public void shouldCalculateAvgNegative(){
        CashMachine KRA444 = new CashMachine("KRA444");
        KRA444.addTransaction(10);
        KRA444.addTransaction(-5);
        CashMachine RZ21 = new CashMachine("RZ21");
        RZ21.addTransaction(15.5);
        RZ21.addTransaction(-5.2);
        RZ21.addTransaction(5);

        bank.addCashMachine(KRA444);
        bank.addCashMachine(RZ21);

        assertEquals(5.1,bank.getAvgNegative(),0.001);
    }

    @Test
    public void shouldCountZeros(){
        CashMachine KRA444 = new CashMachine("KRA444");
        KRA444.addTransaction(0);
        KRA444.addTransaction(0);
        CashMachine RZ21 = new CashMachine("RZ21");
        RZ21.addTransaction(0);
        KRA444.addTransaction(0);

        bank.addCashMachine(KRA444);
        bank.addCashMachine(RZ21);


        assertEquals(0, bank.getTotalPositiveCounter());
        assertEquals(0, bank.getTotalNegativeCounter());
    }

    @Test
    public void shouldGetZeroAveragePositive(){
        CashMachine KRA444 = new CashMachine("KRA444");
        KRA444.addTransaction(0);
        KRA444.addTransaction(0);
        CashMachine RZ21 = new CashMachine("RZ21");
        RZ21.addTransaction(0);
        RZ21.addTransaction(0);

        bank.addCashMachine(KRA444);
        bank.addCashMachine(RZ21);

        assertEquals(0, bank.getAvgPositive(), 0.00001);
    }

    @Test
    public void shouldGetZeroAverageNegative(){
        CashMachine KRA444 = new CashMachine("KRA444");
        KRA444.addTransaction(0);
        KRA444.addTransaction(0);
        CashMachine RZ21 = new CashMachine("RZ21");
        RZ21.addTransaction(0);
        RZ21.addTransaction(0);

        bank.addCashMachine(KRA444);
        bank.addCashMachine(RZ21);

        assertEquals(0, bank.getAvgNegative(), 0.00001);
    }

    @Test
    public void shouldShowNegativePositive(){
        CashMachine KRA444 = new CashMachine("KRA444");
        KRA444.addTransaction(5);
        KRA444.addTransaction(-4);
        CashMachine RZ21 = new CashMachine("RZ21");
        RZ21.addTransaction(4);
        RZ21.addTransaction(-2);

        bank.addCashMachine(KRA444);
        bank.addCashMachine(RZ21);

        assertEquals(3, bank.getAvgNegative(), 0.00001);
    }

    @Test
    public void shouldShowZeroWithAllNegativeTransactions(){
        CashMachine KRA444 = new CashMachine("KRA444");
        KRA444.addTransaction(-5);
        KRA444.addTransaction(-4);
        CashMachine RZ21 = new CashMachine("RZ21");
        RZ21.addTransaction(-4);
        RZ21.addTransaction(-2);

        bank.addCashMachine(KRA444);
        bank.addCashMachine(RZ21);

        assertEquals(0, bank.getTotalBalance(), 0.00001);
    }

    @Test
    public void shouldNotLetExceedBalance(){
        CashMachine KRA444 = new CashMachine("KRA444");
        KRA444.addTransaction(5);
        KRA444.addTransaction(-4);
        KRA444.addTransaction(-2);
        CashMachine RZ21 = new CashMachine("RZ21");
        RZ21.addTransaction(4);
        RZ21.addTransaction(-2.5);
        RZ21.addTransaction(-5);

        bank.addCashMachine(KRA444);
        bank.addCashMachine(RZ21);

        assertEquals(2.5, bank.getTotalBalance(), 0.00001);
    }
}
