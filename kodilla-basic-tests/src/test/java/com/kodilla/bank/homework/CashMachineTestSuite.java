package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    CashMachine cashMachine = new CashMachine("KRA4242");

    @Test
    public void shouldHaveZeroLength(){
        double[] transactions = cashMachine.getTransactions();

        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldHaveZeroBalance(){
        assertEquals(0,cashMachine.getBalance(),0.00001);
    }

    @Test
    public void shouldNotAddNegativeTransactionIfCashMachineEmpty(){
        cashMachine.addTransaction(-2);
        double [] transactions = cashMachine.getTransactions();

        assertEquals(0,transactions.length);
    }

    @Test
    public void shouldNotAddEmptyTransaction(){
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(-0);
        double [] transactions = cashMachine.getTransactions();

        assertEquals(0,transactions.length);
    }

    @Test
    public void shouldAddPositiveTransaction(){
        cashMachine.addTransaction(5);
        cashMachine.addTransaction(4.5);
        double [] transactions = cashMachine.getTransactions();

        assertEquals(5,transactions[0],0.0001);
        assertEquals(4.5,transactions[1],0.0001);
    }

    @Test
    public void shouldNotAddNegativeTransactionIfExceedsBalance(){
        cashMachine.addTransaction(5.5);
        cashMachine.addTransaction(-6);
        double [] transactions = cashMachine.getTransactions();

        assertEquals(1,transactions.length);
        assertEquals(5.5,transactions[0],0.0001);
    }

    @Test
    public void shouldNotHaveNegativeBalance(){
        cashMachine.addTransaction(1.5);
        cashMachine.addTransaction(1);
        cashMachine.addTransaction(-4);
        cashMachine.addTransaction(1);

        assertEquals(3.5,cashMachine.getBalance(),0.00001);
    }

    @Test
    public void shouldAddNegativeTransactionWithinBalance(){
        cashMachine.addTransaction(15.5);
        cashMachine.addTransaction(-12.3);
        double transactions[] = cashMachine.getTransactions();

        assertEquals(15.5,transactions[0],0.00001);
        assertEquals(-12.3, transactions[1],0.00001);
        assertEquals(2,transactions.length);
    }

    @Test
    public void shouldZeroBalance(){
        cashMachine.addTransaction(5.5);
        cashMachine.addTransaction(-5.5);

        assertEquals(0,cashMachine.getBalance(),0.00001);
    }

    @Test
    public void shouldHaveZeroCounter(){
        assertEquals(0,cashMachine.getPositiveCount());
        assertEquals(0,cashMachine.getNegativeCount());
    }

    @Test
    public void shouldHaveZeroSum(){
        assertEquals(0,cashMachine.getNegativeSum(),0.00001);
        assertEquals(0,cashMachine.getPositiveSum(),0.00001);
    }

    @Test
    public void shouldSumTransactionsProperly(){
        cashMachine.addTransaction(10);
        cashMachine.addTransaction(-2.5);
        cashMachine.addTransaction(-2);
        cashMachine.addTransaction(4);

        assertEquals(4.5,cashMachine.getNegativeSum(),0.00001);
        assertEquals(14,cashMachine.getPositiveSum(),0.00001);
    }

    public void shouldCountTransactionsProperly(){
        cashMachine.addTransaction(10);
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(-2.5);
        cashMachine.addTransaction(-2);
        cashMachine.addTransaction(4);
        cashMachine.addTransaction(-0);
        cashMachine.addTransaction(-1);


        assertEquals(2,cashMachine.getPositiveCount());
        assertEquals(3,cashMachine.getNegativeCount());
    }
}
