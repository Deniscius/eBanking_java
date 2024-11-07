package org.example.ebanking.model;

import org.example.ebanking.Interface.Accountinterface;

import java.util.List;

public class Account implements Accountinterface {
    private int id;
    private String accountNumber;
    private String rib;
    private int state;
    private float balance;
    private String agencyCode;
    private List<Transaction> transaction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

    @Override
    public void create(Account account) {

    }

    @Override
    public void read(int id) {

    }

    @Override
    public void update(Account account) {

    }

    @Override
    public void delete(int id) {

    }
}

