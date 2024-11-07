package org.example.ebanking;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.ebanking.model.Client;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Scanner;

import static org.example.ebanking.utiles.Constant.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, SQLException {
        launch();



        String confirmPassword;

        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nom de famille votre client :");
        client.setNom(scanner.nextLine());

        while (client.getNom().trim().isEmpty() || client.getNom().trim().length() > LAST_NAME_MAX_LENGHT) {
            System.out.println("le nom doit contenir au moins un (01) ou " + LAST_NAME_MAX_LENGHT + "caractères");
            client.setNom(scanner.nextLine());
        }

        System.out.println("Entrez le prénom de  votre client :");
        client.setPrenom(scanner.nextLine());

        while (client.getPrenom().trim().isEmpty() || client.getPrenom().trim().length() > FIRST_NAME_MAX_LENGHT) {
            System.out.println("le prénom doit contenir au moins un (01) ou " + FIRST_NAME_MAX_LENGHT+ "caractères");
            client.setPrenom(scanner.nextLine());
        }


        System.out.println("Entrez le muméro de téléphone de votre client");
        client.setTel(scanner.next());

        System.out.println("Entrez l'email de votre client");
        client.setEmail(scanner.next());

        System.out.println("Entrez l'adresse de votre client");
        client.setAdresse(scanner.next());

        System.out.println("Entrez le mot de passe de votre client");
        client.setPassword(scanner.next());


        while (!client.getPassword().matches(String.valueOf(PATTERN))) {
            System.out.println("Politique de mot de passe");
            System.out.println("Votre mot de passe doit contenir au moins un chiffre");
            System.out.println("Votre mot de passe doit contenir au moins un caractère spécial");
            System.out.println("Votre mot de passe doit contenir au moins une lettre Majuscule");
            System.out.println("Votre mot de passe ne doit pas contenir d'espace");
            System.out.println("Votre mot de passe doit contenir au moins huit (8) caractères");


            client.setPassword(scanner.next());

        }

        System.out.println("Veuillez confirmez le mot de passe");
        confirmPassword = scanner.nextLine();

        while (!client.getPassword().equals(confirmPassword)) {
            System.out.println("les deux mots de passe ne sont pas identiques");

            confirmPassword =scanner.next();
        }

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(client.getPassword().getBytes(StandardCharsets.UTF_8));
        String encoded = Base64.getEncoder().encodeToString(hash);

        client.setPassword(encoded);

        client.create(client);
    }
}