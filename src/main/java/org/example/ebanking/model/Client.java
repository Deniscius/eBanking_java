package org.example.ebanking.model;

import org.example.ebanking.dbconfig.IDBConfig;
import org.example.ebanking.Interface.ClientInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Client implements ClientInterface {
    private int id_client;
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private String adresse;
    private String password;

    private List<Account> accounts;

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }


    Connection connection;


    @Override
    public void create(Client client) throws SQLException {
        connection = IDBConfig.getConnection();
        if (connection != null) {

            String req = "INSERT INTO clients (nom, prenom, tel, email, adresse, password) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement prepareStatement = this.connection.prepareStatement(req);
            prepareStatement.setString(1, client.getNom());
            prepareStatement.setString(2, client.getPrenom());
            prepareStatement.setString(3, client.getTel());
            prepareStatement.setString(4, client.getEmail());
            prepareStatement.setString(5, client.getAdresse());
            prepareStatement.setString(6, client.getPassword());

            prepareStatement.executeUpdate();
            prepareStatement.close();
            this.connection.close();

            System.out.println("Client ajouté avec succès !");
        }

    }

    @Override
    public void read(int id) {

    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Client> list() throws SQLException {
        List<Client> clients = new ArrayList<>();

        connection = IDBConfig.getConnection();
        if (connection != null) {

            String req = "SELECT * FROM clients";
            PreparedStatement prepareStatement = this.connection.prepareStatement(req);

            ResultSet resultSet = prepareStatement.executeQuery();

            while (resultSet.next()){
                Client client = new Client();
                client.setId_client(resultSet.getInt("id_client"));
                client.setNom(resultSet.getString("nom"));
                client.setPrenom(resultSet.getString("prenom"));
                client.setTel(resultSet.getString("tel"));
                client.setEmail(resultSet.getString("email"));

                clients.add(client);
            }
            prepareStatement.close();
            this.connection.close();

        }
        return clients;
    }
}