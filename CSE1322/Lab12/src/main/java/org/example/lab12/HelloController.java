package org.example.lab12;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    private TextField num1;
    private TextField num2;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(Integer.toString(Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText())));
    }
}

