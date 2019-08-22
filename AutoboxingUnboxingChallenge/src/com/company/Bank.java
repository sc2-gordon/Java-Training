package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branch;

    public Bank(String name) {
        this.name = name;
        branch = new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        if(findBranch(name) == null){
            this.branch.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addBranchCustomer(String name, String customerName, double amount){
        Branch existingBranch = findBranch(name);
        if(findBranch(name) != null){
            return existingBranch.addCustomer(customerName,amount);
        }
        return false;
    }

    public boolean addTransaction(String name, String customerName, double amount){
        Branch existingBranch = findBranch(name);
        if(findBranch(name) != null){
            return existingBranch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }

    public boolean getCustomers(String name, boolean showTransactions){
        Branch branch = findBranch(name);
        if(branch != null){
            System.out.println("Customer details for branch: ");
            ArrayList<Customer> branchCustomers = branch.getCustomer();
            for(int i=0;i<this.branch.size();i++){
                Customer currentCustomer = branchCustomers.get(i);
                System.out.println(currentCustomer.getName());
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = currentCustomer.getTransactions();
                    for(int j=0;j<transactions.size();j++){
                        System.out.println("[" + (j+1) + "]" +"Amount: " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private Branch findBranch(String name){
        for(int i=0;i<this.branch.size();i++){
            Branch currentBranch = this.branch.get(i);
            if(currentBranch.getBranchName().equals(name)){
                return currentBranch;
            }
        }
        return null;
    }

}
