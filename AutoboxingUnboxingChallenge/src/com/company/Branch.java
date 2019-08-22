package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customer;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customer = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public boolean addCustomer(String name, double amount){
        if(findCustomer(name) == null){
            this.customer.add(new Customer(name,amount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double amount){
        Customer existingCustomer = findCustomer(name);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name){
        for(int i=0;i<this.customer.size();i++){
            Customer checkedCustomer = this.customer.get(i);
            if(checkedCustomer.getName().equals(name)){
                return checkedCustomer;
            }
        }
        return null;
    }
}
