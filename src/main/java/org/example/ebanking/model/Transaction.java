package org.example.ebanking.model;

import org.example.ebanking.Interface.Transactioninterface;

public class Transaction implements Transactioninterface{
    private int id;
    private float amount;
    private int state;
    private String type;
    private String createAt;
    private String updateAt;
    private String accountId;
    private Client clientId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }


    @Override
    public void create(Transaction transaction) {

    }

    @Override
    public void read(int id) {

    }

    @Override
    public void update(Transaction transaction) {

    }

    @Override
    public void delete(int id) {

    }
}

