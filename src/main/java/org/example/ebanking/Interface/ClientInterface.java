package org.example.ebanking.Interface;

import org.example.ebanking.model.Client;

import java.sql.SQLException;
import java.util.List;

public interface ClientInterface {
    void create(Client client) throws SQLException;
    void read(int id);
    void update(Client client);
    void delete(int id);

    List<Client> list() throws SQLException;
}
