package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("HSBC");
        bank.addBranch("Selangor");
        bank.addBranchCustomer("Selangor","Sean",55.20);
        bank.addBranchCustomer("Selangor","Tim",20.00);
        bank.addBranchCustomer("Selangor","Kate",250.44);

        bank.addBranch("Nilai");
        bank.addBranchCustomer("Nilai", "Judy", 88.96);
        bank.addBranchCustomer("Nilai", "Adam", 0.50);

        bank.addTransaction("Selangor", "Sean", 45.80);
        bank.addTransaction("Selangor", "Tim", 120.35);
        bank.addTransaction("Selangor", "Tim", 120.35);

        bank.getCustomers("Selangor",true);
        bank.getCustomers("Nilai", true);
    }
}
