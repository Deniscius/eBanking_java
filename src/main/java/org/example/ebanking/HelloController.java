package org.example.ebanking;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.ebanking.model.Client;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    private ObservableList<Client> clients;
    @FXML
    private TableView<Client> ClientsTable;

    @FXML
    private TableColumn<Client, String> emailCol;

    @FXML
    private TableColumn<Client, String> firstNameCol;

    @FXML
    private TableColumn<Client, String> idcol;

    @FXML
    private TableColumn<Client, String> lastNameCol;

    @FXML
    private TableColumn<Client, String> telCol;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        clients = FXCollections.observableArrayList();

        idcol.setCellValueFactory(new PropertyValueFactory<Client, String>("id_client"));
        firstNameCol.setCellValueFactory(new PropertyValueFactory<Client, String>("nom"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<Client, String>("prenom"));
        emailCol.setCellValueFactory(new PropertyValueFactory<Client, String>("email"));
        telCol.setCellValueFactory(new PropertyValueFactory<Client, String>("tel"));


        Client client = new Client();
        try {
            clients.addAll(client.list());
            ClientsTable.setItems(clients);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
