package org.example.ebanking.Interface;

import org.example.ebanking.model.Account;
import org.example.ebanking.model.Client;

public interface Accountinterface {
    void create(Account account);
    void read(int id);
    void update(Account account);
    void delete(int id);
}

