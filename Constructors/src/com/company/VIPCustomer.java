package com.company;

public class VIPCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VIPCustomer(){
        this.name = "Default Name";
        this.creditLimit = 500;
        this.email = "Default@email.com";
    }

    public VIPCustomer(String name, String email) {
        this(name, 500, email);
    }

    public VIPCustomer(String name, int creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
