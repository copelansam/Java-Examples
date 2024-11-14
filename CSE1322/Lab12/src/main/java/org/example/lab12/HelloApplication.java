package org.example.lab12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    int first;
    int second;
    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 400, 300);
        stage.setTitle("MegaCalc");
        TextArea num1 = new TextArea();
        num1.setPrefHeight(1);
        num1.setPrefWidth(100);
        TextArea num2 = new TextArea();
        num2.setPrefHeight(1);
        num2.setPrefWidth(100);

        Button plus = new Button("+");

        Label result = new Label();
        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                first = Integer.parseInt(num1.getText());
                second = Integer.parseInt(num2.getText());
                result.setText(Integer.toString(first + second));
                num1.setText("");
                num2.setText("");
            }
        });

        grid.add(num1, 150,10);
        grid.add(num2,300,10);
        grid.add(plus, 200,200);
        grid.add(result,200,225);

        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}