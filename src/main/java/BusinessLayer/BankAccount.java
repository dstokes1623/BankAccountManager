/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

/**
 *
 * @author 0798727
 */
public class BankAccount {
    private int bankAccountId;
    private String name;
    private double balance;
    private BankAccountType type;
    private int userId;

    public BankAccount(int bankAccountId, String name, double balance, BankAccountType type, int userId) {
        this.bankAccountId = bankAccountId;
        this.name = name;
        this.balance = balance;
        this.type = type;
        this.userId = userId;
    }

    public int getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(int bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccountType getType() {
        return type;
    }

    public void setType(BankAccountType type) {
        this.type = type;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "bankAccountId=" + bankAccountId + ", name=" + name + ", balance=" + balance + ", type=" + type + ", userId=" + userId + '}';
    }
    
    
}
