/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loan;

abstract class Loan {
    protected int loan_id;
    protected String cust_name;
    protected double amount;

    public Loan() {
        amount = 0.0;
    }

    // Setters
    public void setLoanId(int id) { loan_id = id; }
    public void setCustName(String name) { cust_name = name; }
    public void setAmount(double amt) { amount = amt; }

    // Getters
    public int getLoanId() { return loan_id; }
    public String getCustName() { return cust_name; }
    public double getAmount() { return amount; }

    // Abstract method
    public abstract String loanType();
}
