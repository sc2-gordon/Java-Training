package com.company;

public class BankAccount {
    private int bankAccountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this(5421,353543,"Default","Add",01245);
    }

    public BankAccount(int bankAccountNumber, int balance, String customerName, String email, int phoneNumber){
        System.out.println("Account constructor called");
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(9999,100, customerName, email, phoneNumber);
    }

    public int getBankAccountNumber(){
        return this.bankAccountNumber;
    }

    public int getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber){
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void addFunds(int funds){
        balance += funds;
    }

    public void withdrawFunds(int funds){
        if(balance>=funds) {
            balance -= funds;
        } else {
            System.out.println("Insufficient balance for the funds requested. Balance has not been touched.");
        }
    }

}
