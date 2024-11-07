package org.example.ebanking.Interface;

import org.example.ebanking.model.Client;
import org.example.ebanking.model.Transaction;

public interface Transactioninterface {

    void create(Transaction transaction);
    void read(int id);
    void update(Transaction transaction);
    void delete(int id);
}
