package com.kodilla.bank.homework;

public class Bank {
    private String name;
    private CashMachine[] cashMachines;
    private int size;

    public Bank(String name){
        this.name = name;
        this.cashMachines = new CashMachine[0];
        this.size = 0;
    }

    public CashMachine[] getCashMachines() {
        return this.cashMachines;
    }

    public void addCashMachine(CashMachine cashMachine){
        this.size++;
        CashMachine[] tempTab = new CashMachine[this.size];
        System.arraycopy(this.cashMachines, 0, tempTab, 0, this.cashMachines.length);
        tempTab[this.size-1] = cashMachine;
        this.cashMachines = tempTab;
    }

    public double getTotalBalance(){
        if (this.size == 0){
            return 0;
        }
        double totalBalance = 0;
        for (int i = 0; i < this.size; i++){
            totalBalance = totalBalance + this.cashMachines[i].getBalance();
        }
        return totalBalance;
    }

    public int getTotalPositiveCounter(){
        if (this.size == 0){
            return 0;
        }
        int totalPositiveCounter = 0;
        for (int i = 0; i < this.size; i++){
            totalPositiveCounter = totalPositiveCounter + this.cashMachines[i].getPositiveCount();
        }
        return totalPositiveCounter;
    }

    public int getTotalNegativeCounter(){
        if (this.size == 0){
            return 0;
        }
        int totalNegativeCounter = 0;
        for (int i = 0; i < this.size; i++){
            totalNegativeCounter = totalNegativeCounter + this.cashMachines[i].getNegativeCount();
        }
        return totalNegativeCounter;
    }

    public double getAvgPositive(){
        if (this.size == 0){
            return 0;
        }
        int counter = this.getTotalPositiveCounter();
        if (counter == 0){
            return 0;
        }
        double positive = 0;
        for (int i = 0; i < this.size; i++){
            positive = positive + this.cashMachines[i].getPositiveSum();
        }
        return positive / counter;
    }

    public double getAvgNegative(){
        if (this.size == 0){
            return 0;
        }
        int counter = this.getTotalNegativeCounter();
        if (counter == 0){
            return 0;
        }
        double negative = 0;
        for (int i = 0; i < this.size; i++){
            negative = negative + this.cashMachines[i].getNegativeSum();
        }
        return negative / counter;
    }

}
