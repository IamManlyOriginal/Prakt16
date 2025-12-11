package com.example.prakt16;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField nameField;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        String username = nameField.getText().trim();
        if (username.isEmpty()) {
            welcomeText.setText("Введи имя!");
        } else {
            welcomeText.setText("Привет " + username + "!");
        }

    }
}
