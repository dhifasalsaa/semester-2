package org.example.com.main.UI;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Sanksi extends Application {

    private TextField nameField;
    private TextField nimField;
    private TextField lateDaysField;
    private Label fineLabel;
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        initializeUI();
    }

    private void initializeUI() {
        primaryStage.setTitle("Sanksi Keterlambatan");

        // Create the input fields
        nameField = new TextField();
        nimField = new TextField();
        lateDaysField = new TextField();

        // Create labels
        Label nameLabel = new Label("Nama:");
        Label nimLabel = new Label("NIM:");
        Label lateDaysLabel = new Label("Jumlah Keterlambatan (hari):");
        fineLabel = new Label();

        // Create buttons and radio buttons
        Button calculateButton = new Button("Hitung Denda");

        // Add action for the calculate button
        calculateButton.setOnAction(event -> calculateFine());

        // Layout
        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);
        // Add elements to the layout
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(nimLabel, 0, 1);
        gridPane.add(nimField, 1, 1);
        gridPane.add(lateDaysLabel, 0, 2);
        gridPane.add(lateDaysField, 1, 2);
        gridPane.add(calculateButton, 0, 3);
        gridPane.add(fineLabel, 1, 3);

        // Create scene and add to stage
        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculateFine() {
        try {
            String name = nameField.getText();
            String nim = nimField.getText();
            int lateDays = Integer.parseInt(lateDaysField.getText());
            int fine = lateDays * 1000;
            fineLabel.setText("Jumlah Denda: Rp " + fine);
        } catch (NumberFormatException e) {
            fineLabel.setText("Masukkan jumlah keterlambatan yang valid.");
        }
    }

    public void showUI() {
        Platform.runLater(() -> {
            if (primaryStage == null) {
                primaryStage = new Stage();
                initializeUI();
            } else {
                primaryStage.show();
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
