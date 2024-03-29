package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;
    private int size;
    private String id;



    public CashMachine(String id){
        this.transactions = new double[0];
        this.size = 0;
        this.id = id;
    }

     public void addTransaction(double value){
        if ((Math.abs(value) <= this.getBalance() || value > 0) && value != 0) {
            size++;
            double tempTab[] = new double[size];
            System.arraycopy(this.transactions, 0, tempTab, 0, transactions.length);
            tempTab[size - 1] = value;
            this.transactions = tempTab;
        }
    }

    public double[] getTransactions() {
        return this.transactions;
    }

    public double getBalance() {
        double balance = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            balance = balance + this.transactions[i];
        }
        return balance;
    }

    public int getPositiveCount(){
        int counter = 0;
        for (int i = 0; i < this.transactions.length; i++){
            if (this.transactions[i] > 0){
                counter++;
            }
        }
        return counter;
    }

    public int getNegativeCount(){
        int counter = 0;
        for (int i = 0; i < this.transactions.length; i++){
            if (this.transactions[i] < 0){
                counter++;
            }
        }
        return counter;
    }

    public double getPositiveSum(){
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++){
            if (this.transactions[i] > 0){
                sum = sum + this.transactions[i];
            }
        }
        return sum;
    }

    public double getNegativeSum(){
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++){
            if (this.transactions[i] < 0){
                sum = sum + this.transactions[i];
            }
        }
        return Math.abs(sum);
    }
}
